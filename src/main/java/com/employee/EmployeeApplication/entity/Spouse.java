package com.employee.EmployeeApplication.entity;


import javax.persistence.*;

@Entity
@Table(name = "spuse")
public class Spouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String mobileNo;
    private int age;

    public Spouse(String name, String mobileNo, int age) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.age = age;
    }

    public Spouse() {
    }

    public int getId(){
        return id;
    }



}
