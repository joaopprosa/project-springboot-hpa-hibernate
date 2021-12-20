package com.joaorosa.springbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaorosa.springbootjpahibernate.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
