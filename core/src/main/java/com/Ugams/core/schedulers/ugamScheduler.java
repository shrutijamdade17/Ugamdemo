package com.ugams.core.schedulers;

import com.ugams.core.config.SchedulerConfig;
import com.ugams.core.services.CurrentDate;
import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;

@Component(immediate = true, service = UgamScheduler.class)
@Designate(ocd = SchedulerConfig.class)
public class UgamScheduler implements Runnable {
  
    private int schedulerId;

    @Reference
    CurrentDate currentDate;

    @Reference
    private Scheduler scheduler;

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
        currentDate.updateDate("/content/ugams/us/en/demo/jcr:content/root/container/currenttime");
      }
    }


