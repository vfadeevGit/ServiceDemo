package com.company.servicedemo.screen.job;

import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.Job;

@UiController("Job.browse")
@UiDescriptor("job-browse.xml")
@LookupComponent("jobsTable")
public class JobBrowse extends StandardLookup<Job> {
}