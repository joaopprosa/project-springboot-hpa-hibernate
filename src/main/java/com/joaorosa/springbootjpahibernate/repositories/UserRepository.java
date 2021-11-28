package com.joaorosa.springbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaorosa.springbootjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
