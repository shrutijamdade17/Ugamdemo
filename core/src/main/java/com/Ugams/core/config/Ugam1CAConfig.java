package com.ugams.core.config;

import org.apache.sling.caconfig.annotation.Configuration;
import org.apache.sling.caconfig.annotation.Property;
@Configuration(label="",description = "")

public @interface Ugam1CAConfig {

    @Property(label = "siteCountry",
            description = "Site Name")
    String siteCountry() default "us";
    @Property(label = "siteLocale",
            description = "Site Lang")
    String siteLocale() default "en";
    @Property(label = "siteAdmin",
            description = "Site Admin")
    String siteAdmin() default "ugam";
    @Property(label = "siteSection",
            description = "Site Section")
    String siteSection() default "aem";




}