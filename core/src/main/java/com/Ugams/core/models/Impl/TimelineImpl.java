package com.Ugams.core.models.Impl;


import com.Ugams.core.models.Timeline;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Model(adaptables = Resource.class,
        adapters = Timeline.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class TimelineImpl implements Timeline{


    @ChildResource
    Resource timeline;

    @Override
    public List<Map<String, String>> getTimelineDetails() {
        List<Map<String, String>> timelineMap = new ArrayList<>();
        if (timeline != null) {
            for (Resource fact : timeline.getChildren()) {
                Map<String, String> tMap = new HashMap<>();
                tMap.put("title", fact.getValueMap().get("title", String.class));
                tMap.put("text1", fact.getValueMap().get("text1", String.class));
                tMap.put("text2", fact.getValueMap().get("text2", String.class));
                timelineMap.add(tMap);
            }
        }
        return timelineMap;
    }
}
