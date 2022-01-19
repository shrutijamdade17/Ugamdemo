package com.ugams.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class FetchData {

    private static HttpsURLConnection connection;

    public static String getFetchData(String httpurl) throws MalformedURLException {

        final Logger log = LoggerFactory.getLogger(FetchData.class);

        log.info("inside fetchdata");
        BufferedReader reader;
        String line;
        StringBuffer responceContent = new StringBuffer();
        URL url = new URL(httpurl);;
        try {
            log.info("inside try FetchData");
            connection = (HttpsURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            int status = connection.getResponseCode();
            if(status>299){
                log.info("Status"+status);
            }else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null){
                    responceContent.append(line);
                }
                reader.close();
            }
            return responceContent.toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Failed";

    }

}
