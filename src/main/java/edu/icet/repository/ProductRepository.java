package edu.icet.repository;

import edu.icet.dto.LowStockProductDTO;
import edu.icet.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query("SELECT p FROM ProductEntity p WHERE p.quantity < :threshold")
    List<LowStockProductDTO> findLowStockProducts(int threshold);
}
