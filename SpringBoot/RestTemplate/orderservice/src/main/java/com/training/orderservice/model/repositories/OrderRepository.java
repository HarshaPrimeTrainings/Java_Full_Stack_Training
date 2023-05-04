package com.training.orderservice.model.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.orderservice.model.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer>{

	public List<Orders> getByUid(Integer uid);
}
