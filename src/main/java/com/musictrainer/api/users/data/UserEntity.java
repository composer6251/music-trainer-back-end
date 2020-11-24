package com.musictrainer.api.users.data;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_data")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "first_name")
    private String name;
    @NonNull
    @Column(name = "email")
    private String email;
    @NonNull
    @Column(name = "username")
    private String username;
    private int currentLevel;
    @NonNull
    private String password;

    private String errorMessage;

}
