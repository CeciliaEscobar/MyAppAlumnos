package com.cecilia.myappalumno;

public class User {
    private Integer id;
    private String name;

    private String career;
    private String email;

    private String phone;

    private String document;

    public User() {
    }

    public User(Integer id, String name, String career, String email, String phone, String document) {
        this.id = id;
        this.name = name;
        this.career = career;
        this.email = email;
        this.phone = phone;
        this.document = document;
    }

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

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}