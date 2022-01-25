package com.ugams.core.models.impl;

import com.ugams.core.models.FetchUserList;
import com.ugams.core.services.FetchUserService;
import com.ugams.core.utils.FetchData;
import com.ugams.core.utils.Network;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class,
        adapters = FetchUserList.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class FetchUserListImpl implements FetchUserList {

    final Logger log = LoggerFactory.getLogger(FetchUserListImpl.class);

    @Inject
    String pageno;

    @OSGiService
    FetchUserService fetchUserService;

    @Override
    public List<Map<String, String>> getData() throws JSONException, MalformedURLException {
        String multiurl = fetchUserService.getUserList()+pageno;
        String message = FetchData.getFetchData(multiurl);
        JSONObject jsonObject =  new JSONObject(message);
        log.info("============================List of users"+String.valueOf(jsonObject));
        JSONArray jsonArray1 = jsonObject.getJSONArray("data");
        List<Map<String, String>> userList = new ArrayList<>();
        for (int i=0;i<jsonArray1.length();i++){
            Map<String,String> user =new HashMap<>();
            user.put("fname",jsonArray1.getJSONObject(i).getString("first_name"));
            user.put("lname",jsonArray1.getJSONObject(i).getString("last_name"));
            user.put("email",jsonArray1.getJSONObject(i).getString("email"));
            user.put("avatar",jsonArray1.getJSONObject(i).getString("avatar"));
            userList.add(user);
        }
        log.info("===list==="+userList);
        return userList;
    }

}
