package edu.icet.repository;

import edu.icet.dto.LowStockProductDTO;
import edu.icet.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
    @Query("SELECT new edu.icet.dto.LowStockProductDTO(p.id, p.name, p.stockQty) " +
            "FROM ProductEntity p WHERE p.stockQty < :threshold")
    List<LowStockProductDTO> findLowStockProducts(int threshold);
}
