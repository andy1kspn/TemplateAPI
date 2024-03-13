package com.example.dezvoltareaaplicatiilorweb.entity;

import javax.persistence.*;

@Entity
@Table(name = "users", schema = "magazin_online", catalog = "")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "birthdate")
    private String birthdate;

    @Column(name = "country")
    private String country;

    @Column(name = "sex")
    private String sex;

    public User() {
    }

    public User(Long id, String name, String email, String password, String birthdate, String country, String sex) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
        this.country = country;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
