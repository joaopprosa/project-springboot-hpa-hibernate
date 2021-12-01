package com.joaorosa.springbootjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaorosa.springbootjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
