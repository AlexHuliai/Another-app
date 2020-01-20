package com.capstone.caps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.caps.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
