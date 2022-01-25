package com.ugams.core.models;

import org.json.JSONException;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface FetchApi {
    public List<Map<String, String>> getMessage() throws IOException, JSONException;
}
