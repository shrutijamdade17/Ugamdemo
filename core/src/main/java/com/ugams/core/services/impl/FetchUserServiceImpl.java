package com.ugams.core.services.impl;

import com.ugams.core.config.FetchApiOsgiConfig;
import com.ugams.core.services.FetchUserService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.metatype.annotations.Designate;

@Component(service = FetchUserService.class,immediate = true)
@Designate(ocd = FetchApiOsgiConfig.class )
public class FetchUserServiceImpl implements FetchUserService {
    private String SingleUser;
    private String MultiUser;

    public void activate(FetchApiOsgiConfig fetchApiOsgiConfig){
        SingleUser=fetchApiOsgiConfig.singleUser();
        MultiUser=fetchApiOsgiConfig.userList();
    }
    @Override
    public String getSingleUser() {
        return SingleUser;
    }

    @Override
    public String getUserList() {
        return MultiUser;
    }
}
