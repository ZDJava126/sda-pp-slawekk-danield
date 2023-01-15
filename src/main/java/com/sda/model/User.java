package com.sda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Builder
@ToString
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String surname;
    private int age;
    private String email;

    public User() {}

    public User(String username, String password, String name, String surname, int age, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }
}
