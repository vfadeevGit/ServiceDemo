package com.company.servicedemo.screen.serviceinquiryjob;

import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.ServiceInquiryJob;

@UiController("ServiceInquiryJob.edit")
@UiDescriptor("service-inquiry-job-edit.xml")
@EditedEntityContainer("serviceInquiryJobDc")
public class ServiceInquiryJobEdit extends StandardEditor<ServiceInquiryJob> {
}