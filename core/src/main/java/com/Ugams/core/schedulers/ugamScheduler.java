package com.Ugams.core.schedulers;

import com.Ugams.core.config.SchedulerConfig;
import com.Ugams.core.services.CurrentDate;
import org.apache.sling.api.resource.*;
import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = ugamScheduler.class)
@Designate(ocd = SchedulerConfig.class)
public class ugamScheduler implements Runnable {
  
    private int schedulerId;

    @Reference
    CurrentDate currentDate;

    @Reference
    private Scheduler scheduler;

    private ResourceResolverFactory resolverFactory;

    private String eventDate;

    String path = "/content/ugams/us/en/demo/jcr:content/root/container/currenttime";

    @Activate
    protected void activate(SchedulerConfig config) {
        schedulerId = config.schedulerName().hashCode();
        addScheduler(config);
    }

    @Deactivate
    protected void deactivate(SchedulerConfig config) {
        removeScheduler();
    }

    private void removeScheduler() {
        scheduler.unschedule(String.valueOf(schedulerId));
    }

    private void addScheduler(SchedulerConfig config) {
        ScheduleOptions scheduleOptions = scheduler.EXPR(config.cronExpression());
        scheduleOptions.name(String.valueOf(schedulerId));
        scheduleOptions.canRunConcurrently(true);
        scheduler.schedule(this, scheduleOptions);
    }
  
    @Override
    public void run() {
        currentDate.UpdateDate(path);
      }
    }


