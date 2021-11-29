package com.company.servicedemo.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Units implements EnumClass<String> {

    HOUR("Hours"),
    PIECE("Pieces"),
    KG("Kilograms"),
    METER("Meters");

    private String id;

    Units(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Units fromId(String id) {
        for (Units at : Units.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}