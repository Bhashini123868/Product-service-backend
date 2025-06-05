package edu.icet.service.impl;

import edu.icet.dto.ProductDTO;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO update(Long id, ProductDTO productDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ProductDTO findById(Long id) {
        return null;
    }

    @Override
    public List<ProductDTO> findAll() {
        return List.of();
    }
}
