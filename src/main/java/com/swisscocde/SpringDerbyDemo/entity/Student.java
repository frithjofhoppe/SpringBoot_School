package com.swisscocde.SpringDerbyDemo.entity;

import javax.persistence.*;

@Entity
public class Student
{
    @Id
    String id;
    String surname;
    String lastname;
    String email;
    @ManyToOne
    SchoolGroup schoolGroup;

    public Student() {
    }

    public Student(String id, String surname, String lastname, String email,String groupId) {
        this.id = id;
        this.surname = surname;
        this.lastname = lastname;
        this.email = email;
        this.schoolGroup = new SchoolGroup(groupId,"");
    }

    public Student(String id, String surname, String lastname, String email, SchoolGroup schoolGroup) {
        this.id = id;
        this.surname = surname;
        this.lastname = lastname;
        this.email = email;
        this.schoolGroup = schoolGroup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SchoolGroup getSchoolGroup() {
        return schoolGroup;
    }

    public void setSchoolGroup(SchoolGroup schoolGroup) {
        this.schoolGroup = schoolGroup;
    }
}
