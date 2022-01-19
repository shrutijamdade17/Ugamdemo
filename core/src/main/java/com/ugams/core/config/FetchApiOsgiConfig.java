package com.ugams.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name="FetchApi Config",
        description = " OSGi Configuration for fetching json data from third party api")
public @interface FetchApiOsgiConfig {
    @AttributeDefinition(
            name = "Single User URL",
            description = "Please add URL for single user",
            type = AttributeType.STRING)
    public String singleUser() default "https://reqres.in/api/users/";

    @AttributeDefinition(
            name = "Multiuser URL",
            description = "Please add URL for list of users",
            type = AttributeType.STRING)
    public String userList() default "https://reqres.in/api/users?page=";
}
