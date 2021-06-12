package com.Ugams.core.models.Impl;

import com.Ugams.core.models.HomeAbout;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = HomeAbout.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HomeAboutImpl implements HomeAbout{

    @Inject
    String title;

    @Inject
    String desc;

    @Inject
    String heading;

    @Inject
    String buttonTitle;

    @Override
    public String getHomeAboutTitle() {
        return title;
    }

    @Override
    public String getHomeAboutHeading() {
        return heading;
    }

    @Override
    public String getHomeAboutDescription() {
        return desc;
    }

    @Override
    public String getHomeAboutButtonTitle() {
        return buttonTitle;
    }
}
