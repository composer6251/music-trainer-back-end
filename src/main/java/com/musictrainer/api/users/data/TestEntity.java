package com.musictrainer.api.users.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(schema = "users", name = "test")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {

    @Id()
    private int idtest;

    private String testcol;
    private String testcol1;
}
