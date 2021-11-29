package com.company.servicedemo.app;

import com.company.servicedemo.entity.Customer;
import com.company.servicedemo.entity.ServiceInquiry;
import com.company.servicedemo.entity.User;
import io.jmix.core.DataManager;
import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component(value = "InquiryServices")
public class InquiryServices {

    @Autowired
    private DataManager dataManager;

    public ServiceInquiry createNewServiceInquiry(String InquiryID, Date RegistrationDate, Customer Customer, String Description, User Initiator) {
        ServiceInquiry newInquiry = dataManager.create(ServiceInquiry.class);
        newInquiry.setInquiryID(InquiryID);
        newInquiry.setDateRegister(RegistrationDate);
        newInquiry.setCustomer(Customer);
        newInquiry.setDescription(Description);
        newInquiry.setInitiator(Initiator);
        return dataManager.save(newInquiry);
    }
}