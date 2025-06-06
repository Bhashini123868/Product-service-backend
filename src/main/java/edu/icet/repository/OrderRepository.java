package edu.icet.repository;

import edu.icet.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    List<OrderEntity> findByCustomerNameContainingIgnoreCase(String name);

    List<OrderEntity> findByDateAfter(LocalDateTime date);
}
