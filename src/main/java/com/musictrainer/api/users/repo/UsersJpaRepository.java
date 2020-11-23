package com.musictrainer.api.users.repo;

import com.musictrainer.api.users.data.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersJpaRepository extends JpaRepository<UserEntity, Integer> {

    List<UserEntity> findByName(String name);

    List<UserEntity> findById(Long id);

//    @Query("select testId from users.test")
//    List<UserEntity> getAllUsers();

}
