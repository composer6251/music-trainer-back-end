package com.musictrainer.api.users.data;

import lombok.Builder;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "user_data")
@Builder
public class UserEntity {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String email;
    private int currentLevel;
    private String password;

    public UserEntity(int id, String name, String email, int currentLevel, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.currentLevel = currentLevel;
        this.password = password;
    }
}
