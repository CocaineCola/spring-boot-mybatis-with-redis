package com.purman.dao.domain;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1435515995276255188L;

    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
