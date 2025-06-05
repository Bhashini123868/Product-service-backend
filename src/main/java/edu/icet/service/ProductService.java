package edu.icet.service;

import edu.icet.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO save(ProductDTO productDTO);
    ProductDTO update(Long id, ProductDTO productDTO);
    void delete(Long id);
    ProductDTO findById(Long id);
    List<ProductDTO> findAll();
}
