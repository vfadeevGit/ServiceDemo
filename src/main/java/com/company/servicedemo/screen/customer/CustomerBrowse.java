package com.company.servicedemo.screen.customer;

import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.Customer;

@UiController("Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}