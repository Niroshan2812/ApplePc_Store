package org.niroshan.applepc_store.Repository;

import org.niroshan.applepc_store.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
}
