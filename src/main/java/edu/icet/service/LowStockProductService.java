package edu.icet.service;

import edu.icet.dto.LowStockProductDTO;

import java.util.List;

public interface LowStockProductService {
    List<LowStockProductDTO> findLowStockProducts(int threshold);
}
