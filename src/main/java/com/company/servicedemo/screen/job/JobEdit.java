package com.company.servicedemo.screen.job;

import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.Job;

@UiController("Job.edit")
@UiDescriptor("job-edit.xml")
@EditedEntityContainer("jobDc")
public class JobEdit extends StandardEditor<Job> {
}