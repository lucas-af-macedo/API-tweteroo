package com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tweteroo.api.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{
    @Query(value = "SELECT * FROM users WHERE username = :username", nativeQuery = true)
    Optional<UserModel> findByUsername(@Param("username") String username);
}