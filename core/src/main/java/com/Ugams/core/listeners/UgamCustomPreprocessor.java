package com.Ugams.core.listeners;

import com.Ugams.core.services.CurrentDate;
import com.Ugams.core.utils.ResolverUtils;
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
            ResourceResolver serviceResourceResolver = null;
            try {
                serviceResourceResolver = ResolverUtils.newResolver(resourceResolverFactory);
                Session session = serviceResourceResolver.adaptTo(Session.class);
                Resource resource = serviceResourceResolver.getResource(path1);
                Node node = resource.adaptTo(Node.class);
                if(node.getProperty("time") != DateUtil.parseISO8601(DateUtil.getISO8601Date(Calendar.getInstance())))
                {
                    currentTime.UpdateDate(path1);
                    session.save();
                    session.logout();
                }
            } catch (LoginException | RepositoryException | InvalidDateException e) {
                e.printStackTrace();
            }
        }
    }
}
