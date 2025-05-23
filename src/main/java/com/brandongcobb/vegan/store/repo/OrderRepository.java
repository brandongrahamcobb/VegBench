package com.brandongcobb.vegan.store.repo;

import com.brandongcobb.vegan.store.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByVeganId(Long veganId);
}