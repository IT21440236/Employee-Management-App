package com.ykods.employeemanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;



     //In case I want to print this out;
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", jobTitle='" + jobTitle + '\'' +
//                ", phone='" + phone + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
//                ", employeeCode='" + employeeCode + '\'' +
//                '}';
//    }
}



//Notes:

/*
Serializable helps transform this java class into different types of stream.

Becuz this class is gonna be saved in a DB and then its going to be send to the
frontend as JSON

So its always best to make classes that are gonna be in different types of stream,
implements the Serializable interface, becuz it helps with this whole process.
 */
