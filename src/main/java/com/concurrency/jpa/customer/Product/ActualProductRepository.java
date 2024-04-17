package com.concurrency.jpa.customer.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActualProductRepository extends JpaRepository<ActualProduct, Long>{
}