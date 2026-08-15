/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studentloginsystem.model;

/**
 *
 * @author DINUKA
 */
public class Student {
    private String fName;
    private String lName;
    private String email;
    private String contact;
    private int id;
    private String pwd;

    public Student(String fName, String lName, String email, String contact, int id, String pwd) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.contact = contact;
        this.id = id;
        this.pwd = pwd;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    
    
    
    
    
}
