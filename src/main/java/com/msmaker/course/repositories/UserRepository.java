package com.msmaker.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msmaker.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
