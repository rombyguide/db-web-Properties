package com.blino.db.models;

/**
 * 02.02.2020
 * Car
 *
 * @author RombyGuIde 
 * @version v1.0
 */

public class Car {
    private Integer id;
    private String model;
    private User owner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Car() {
    }

    public Car(Integer id, String model, User owner) {
        this.id = id;
        this.model = model;
        this.owner = owner;
    }
}
