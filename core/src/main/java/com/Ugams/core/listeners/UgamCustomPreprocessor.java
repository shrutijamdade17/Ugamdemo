package com.Ugams.core.listeners;

import com.Ugams.core.services.CurrentDate;
import com.Ugams.core.utils.ResolverUtil;
import com.day.cq.commons.date.DateUtil;
import com.day.cq.commons.date.InvalidDateException;
import com.day.cq.replication.*;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import java.util.Calendar;

@Component(immediate=true)
public class UgamCustomPreprocessor implements Preprocessor {

    private static final Logger log = LoggerFactory.getLogger(UgamCustomPreprocessor.class);
    @Reference
    private ResourceResolverFactory resourceResolverFactory;
    String path1 = "/content/ugams/us/en/demo/jcr:content/root/container/currenttime";

    @Reference
    CurrentDate currentTime;

    @Override
    public void preprocess(final ReplicationAction replicationAction,
                           final ReplicationOptions replicationOptions) throws ReplicationException {

        if (replicationAction == null || !ReplicationActionType.ACTIVATE.equals(replicationAction.getType())) {
            return;
        }
        String path = replicationAction.getPath();
        if(path.equals("/content/ugams/us/en/demo")){
            log.debug("path equal");
            ResourceResolver serviceResourceResolver = null;
            try {
                log.debug("===============inside try====================");
                serviceResourceResolver = ResolverUtil.newResolver(resourceResolverFactory);
                Session session = serviceResourceResolver.adaptTo(Session.class);
                Resource resource = serviceResourceResolver.getResource(path1);
                Node node = resource.adaptTo(Node.class);
                if(node.getProperty("time") != DateUtil.parseISO8601(DateUtil.getISO8601Date(Calendar.getInstance())))
                {
                    log.debug("===============inside if====================");
                    currentTime.UpdateDate(path1);
                    session.save();
                    session.logout();
                }else {
                    log.debug("===============inside else====================");
                }
            } catch (LoginException | RepositoryException | InvalidDateException e) {
                e.printStackTrace();
            }
        }
        try {
            log.debug(path);
        }
        catch (Exception e) {
            log.debug(e.getMessage());
        }
    }
}
