package org.niroshan.applepc_store.Repository;

import org.niroshan.applepc_store.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
