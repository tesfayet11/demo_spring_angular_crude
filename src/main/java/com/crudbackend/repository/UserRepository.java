package com.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudbackend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
