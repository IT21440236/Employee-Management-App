package com.ykods.employeemanagement.model;

import java.io.Serializable;

public class Employee implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    private String employeeCode;
}



//Notes:

/*
Serializable helps transform this java class into different types of stream.

Becuz this class is gonna be saved in a DB and then its going to be send to the
frontend as JSON

So its always best to make classes that are gonna be in different types of stream,
implements the Serializable interface, becuz it helps with this whole process.
 */
