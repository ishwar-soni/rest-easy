package com.greatlearning.resteasy.entities;

import javax.persistence.*;

@Entity
@Table(name = "food_vendor")
public class FoodVendor {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name", length = 20)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FoodVendor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
