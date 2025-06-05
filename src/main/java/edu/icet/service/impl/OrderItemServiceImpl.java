package edu.icet.service.impl;

import edu.icet.dto.OrderItemDTO;
import edu.icet.repository.OrderItemRepository;
import edu.icet.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemServiceImpl implements OrderItemService {

    final OrderItemRepository repository;
    final ModelMapper mapper;

    @Override
    public OrderItemDTO save(OrderItemDTO orderItemDTO) {
        return null;
    }

    @Override
    public OrderItemDTO update(Long id, OrderItemDTO orderItemDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public OrderItemDTO findById(Long id) {
        return null;
    }

    @Override
    public List<OrderItemDTO> findAll() {
        return List.of();
    }
}
