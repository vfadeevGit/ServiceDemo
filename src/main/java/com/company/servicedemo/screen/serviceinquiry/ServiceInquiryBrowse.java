package com.company.servicedemo.screen.serviceinquiry;

import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.ServiceInquiry;

@UiController("ServiceInquiry.browse")
@UiDescriptor("service-inquiry-browse.xml")
@LookupComponent("table")
public class ServiceInquiryBrowse extends MasterDetailScreen<ServiceInquiry> {
}