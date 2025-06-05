package edu.icet.repository;

import edu.icet.dto.LowStockProductDTO;
import edu.icet.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    List<LowStockProductDTO> findLowStockProducts(int threshold);
}
