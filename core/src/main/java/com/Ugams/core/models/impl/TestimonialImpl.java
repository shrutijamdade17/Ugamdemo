package com.Ugams.core.models.impl;

import com.Ugams.core.models.Testimonial;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.ExporterOption;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class,
        adapters = Testimonial.class,
        resourceType = TestimonialImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class TestimonialImpl implements Testimonial{

    final protected static String RESOURCE_TYPE="ugams/components/content/testimonial";

    @Inject
    String name;

    @Inject
    String desc;

    @Inject
    String desg;

    @Override
    public String getTestimonialName() {
        return name;
    }

    @Override
    public String getTestimonialDescription() {
        return desc;
    }
  
    @Override
    public String getTestimonialDesignation() {
        return desg;
    }
}
