package com.ugams.core.services.impl;

import com.ugams.core.services.CurrentDate;
import com.ugams.core.utils.ResolverUtils;
import com.day.cq.commons.date.DateUtil;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import javax.jcr.Node;
import javax.jcr.Session;
import java.util.Calendar;

@Component(service = CurrentDate.class,immediate = true)
public class CurrentDateImpl implements  CurrentDate {

    @Reference
    ResourceResolverFactory resourceResolverFactory;

    @Override
    public void updateDate(String path) {
        try(ResourceResolver serviceResourceResolver = ResolverUtils.newResolver(resourceResolverFactory)) {
            Session session = serviceResourceResolver.adaptTo(Session.class);
            Resource resource = serviceResourceResolver.getResource("/content/ugams/us/en/demo/jcr:content/root/container/currenttime");
            Node node = resource.adaptTo(Node.class);
            node.setProperty("time", DateUtil.parseISO8601(DateUtil.getISO8601Date(Calendar.getInstance())));
            session.save();
            session.logout();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
