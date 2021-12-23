package com.Ugams.core.services.impl;

import com.Ugams.core.services.CurrentTime;
import com.Ugams.core.utils.ResolverUtil;
import com.day.cq.commons.date.DateUtil;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Node;
import javax.jcr.Session;
import java.util.Calendar;

public class CurrentTimeImpl implements CurrentTime {
        private static final Logger LOG = LoggerFactory.getLogger(CurrentTimeImpl.class);

        @Reference
        ResourceResolverFactory resourceResolverFactory;
        @Override
        public void UpdateTime() {
            try{
                ResourceResolver serviceResourceResolver = ResolverUtil.newResolver(resourceResolverFactory);
                Session session = serviceResourceResolver.adaptTo(Session.class);
                Resource resource = serviceResourceResolver.getResource("/content/ugams/us/en/demo/jcr:content/root/container/currenttime");
                Node node = resource.adaptTo(Node.class);
                node.setProperty("time" , DateUtil.parseISO8601(DateUtil.getISO8601Date(Calendar.getInstance())));
                session.save();
                session.logout();
            } catch (Exception e) {
                LOG.info(e.getMessage());
            }
    }
}

