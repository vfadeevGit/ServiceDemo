package com.company.servicedemo.providers;

import com.company.servicedemo.entity.User;
import io.jmix.bpm.provider.UserProvider;

@UserProvider(value = "findServiceUser")
public class FindServiceUser {

    public User findHeadOfService() {

        return null;
    }
}