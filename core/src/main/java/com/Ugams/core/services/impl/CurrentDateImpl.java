package com.Ugams.core.services.impl;

import com.Ugams.core.services.CurrentDate;
import com.Ugams.core.utils.ResolverUtil;
import com.day.cq.commons.date.DateUtil;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Node;
import javax.jcr.Session;
import java.util.Calendar;

@Component(service = CurrentDate.class,immediate = true)
public class CurrentDateImpl implements  CurrentDate {

    private static final Logger LOG = LoggerFactory.getLogger(CurrentDateImpl.class);
    @Reference
    ResourceResolverFactory resourceResolverFactory;

    String path = "/content/ugams/us/en/demo/jcr:content/root/container/currenttime";

    @Override
    public void UpdateDate(String path) {
        try {
            ResourceResolver serviceResourceResolver = ResolverUtil.newResolver(resourceResolverFactory);
            Session session = serviceResourceResolver.adaptTo(Session.class);
            Resource resource = serviceResourceResolver.getResource(path);
            Node node = resource.adaptTo(Node.class);
            node.setProperty("time", DateUtil.parseISO8601(DateUtil.getISO8601Date(Calendar.getInstance())));
            session.save();
            session.logout();
        } catch (Exception e) {
            LOG.info(e.getMessage());
        }
    }
}
