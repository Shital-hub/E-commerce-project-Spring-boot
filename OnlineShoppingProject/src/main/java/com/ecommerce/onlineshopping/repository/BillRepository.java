package com.ecommerce.onlineshopping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.onlineshopping.model.Bill;

@Repository
public interface BillRepository extends CrudRepository<Bill, Integer>{

}
