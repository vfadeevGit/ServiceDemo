package com.company.servicedemo.screen.customer;

import io.jmix.ui.screen.*;
import com.company.servicedemo.entity.Customer;

@UiController("Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
}