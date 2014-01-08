package com.thoughtworks.yafei;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private NameType name;


    @Autowired
    public void setName(NameType name) {
        this.name = name;
    }
}
