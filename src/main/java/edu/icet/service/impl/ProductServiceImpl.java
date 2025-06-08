package edu.icet.service.impl;

import edu.icet.dto.ProductDTO;
import edu.icet.entity.ProductEntity;
import edu.icet.repository.ProductRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        ProductEntity entity = mapper.map(productDTO, ProductEntity.class);
        ProductEntity savedEntity = repository.save(entity);
        return mapper.map(savedEntity, ProductDTO.class);
    }

    @Override
    public ProductDTO update(Long id, ProductDTO productDTO) {
        Optional<ProductEntity> optionalEntity = repository.findById(id);
        if (optionalEntity.isPresent()){
            ProductEntity entity = optionalEntity.get();
            entity.setName(productDTO.getName());
            entity.setType(productDTO.getType());
            entity.setDescription(productDTO.getDescription());
            entity.setPrice(productDTO.getPrice());
            entity.setStockQty(productDTO.getStockQty());
            entity.setImageURL(productDTO.getImageURL());

            ProductEntity updatedEntity = repository.save(entity);
            return mapper.map(updatedEntity, ProductDTO.class);
        }else {
            throw new RuntimeException("Product not found with ID : " + id);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ProductDTO findById(Long id) {
        ProductEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID : " + id));
        return mapper.map(entity, ProductDTO.class);
    }

    @Override
    public List<ProductDTO> findAll() {
        List<ProductEntity> productEntities = repository.findAll();
        return productEntities.stream()
                .map(entity ->mapper.map(entity, ProductDTO.class))
                .collect(Collectors.toList());
    }
}
