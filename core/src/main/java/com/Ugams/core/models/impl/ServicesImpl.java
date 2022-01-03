package com.Ugams.core.models.impl;


import com.Ugams.core.models.Services;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Services.class,
        resourceType = ServicesImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ServicesImpl implements Services {

    final protected static String RESOURCE_TYPE="ugams/components/content/services";

    @Inject
    String title;

    @Inject
    String text;


    @Override
    public String getServiceTitle() {
        return title;
    }

    @Override
    public String getServiceText() {
        return text;
    }
}
