package com.ugams.core.models.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ugams.core.models.FetchApi;
import com.ugams.core.services.FetchUserService;
import com.ugams.core.utils.FetchData;
import com.ugams.core.utils.Network;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.json.JSONException;
import com.ugams.core.utils.FetchData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class,
        adapters = FetchApi.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class FetchApiImpl implements FetchApi {

    final Logger log = LoggerFactory.getLogger(FetchApiImpl.class);

    @Inject
    public String userid;


    @OSGiService
    FetchUserService fetchUserService;

    @Override
    public List<Map<String, String>> getMessage() throws IOException, URISyntaxException {
        String singleurl = fetchUserService.getSingleUser()+userid;
        log.info("Inside FetchApi Impl"+singleurl);
        String message = FetchData.getFetchData(singleurl);
        log.info("Response From Conn"+message);
        ObjectMapper mapper = new ObjectMapper();
        log.info("objectmapper"+String.valueOf(mapper));
        JsonNode node = mapper.readValue(message, JsonNode.class);
        JsonNode child = node.get("data");
        JsonNode emailId = child.get("email");
        JsonNode avatar = child.get("avatar");
        JsonNode first_name = child.get("first_name");
        JsonNode last_name = child.get("last_name");
        String email =emailId.asText();
        String imagePath = avatar.asText();
        URI uri = new URI(imagePath);
        String path = uri.getPath();
        String idstr = path.substring(path.lastIndexOf("/")+1);
        String imgPath = "/content/dam/ugams/"+idstr;
        String firstName = first_name.asText();
        String lastName = last_name.asText();
        List<Map<String, String>> userdata = new ArrayList<>();
        Map<String, String> tMap = new HashMap<>();
        tMap.put("email",email);
        tMap.put("firstName",firstName);
        tMap.put("lastName",lastName);
        tMap.put("imagePath",imgPath);
        userdata.add(tMap);
        log.info("list"+userdata);
        return userdata;
    }
}

