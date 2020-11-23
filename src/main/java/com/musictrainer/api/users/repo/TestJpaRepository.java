package com.musictrainer.api.users.repo;

import com.musictrainer.api.users.data.TestEntity;
import com.musictrainer.api.users.data.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestJpaRepository extends JpaRepository<TestEntity, Integer> {

   // List<TestEntity> findByName(String name);

   // List<TestEntity> findById(Integer id);

//    @Query("select testId from users.test")
//    List<UserEntity> getAllUsers();

}
