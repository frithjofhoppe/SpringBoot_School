package com.swisscocde.SpringDerbyDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SchoolGroup
{
    @Id
    String id;
    String description;

    public SchoolGroup() {
    }

    public SchoolGroup(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
