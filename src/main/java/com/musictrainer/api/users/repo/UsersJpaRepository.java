package com.musictrainer.api.users.repo;

import com.musictrainer.api.users.data.UsersData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersJpaRepository extends JpaRepository<UsersData, Integer> {

    List<UsersData> findByName(String name);
}
