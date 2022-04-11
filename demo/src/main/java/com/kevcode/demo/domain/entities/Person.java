package com.kevcode.demo.domain.entities;

import javax.persistence.*;

@Entity
@Table(name = "PersonExample",schema = "SP_DEV")
public class Person {
    @Id
    @Column(name = "id")
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }
}
