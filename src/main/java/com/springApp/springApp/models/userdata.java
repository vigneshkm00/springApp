package com.springApp.springApp.models;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class userdata {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PLACE")
    private String place;

    public userdata() {
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return place;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String place) {
        this.place = place;
    }

}
