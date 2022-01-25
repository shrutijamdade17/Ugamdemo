package com.ugams.core.models;

import org.json.JSONException;

import java.util.List;
import java.util.Map;

public interface FetchUserList {
    public List<Map<String, String>> getData() throws JSONException;
}
