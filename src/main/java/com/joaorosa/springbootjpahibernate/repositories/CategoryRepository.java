package com.joaorosa.springbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaorosa.springbootjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
