package edu.icet.service.impl;

import edu.icet.dto.LowStockProductDTO;
import edu.icet.repository.ProductRepository;
import edu.icet.service.LowStockProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LowStockProductServiceImpl implements LowStockProductService {

    final ProductRepository repository;
    final ModelMapper mapper;

    @Override
    public List<LowStockProductDTO> findLowStockProducts(int threshold) {
        return repository.findLowStockProducts(threshold);
    }
}
