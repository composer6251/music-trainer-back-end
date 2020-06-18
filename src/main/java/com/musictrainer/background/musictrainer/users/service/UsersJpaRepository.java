package com.musictrainer.background.musictrainer.users.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersJpaRepository extends JpaRepository<UsersData, Integer> {

    List<UsersData> findByName(String name);
}
