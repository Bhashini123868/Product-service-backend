package edu.icet.service.impl;

import edu.icet.dto.OrderDTO;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    final OrderRepository repository;
    final ModelMapper mapper;

    @Override
    public OrderDTO placeOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO findById(Long id) {
        return null;
    }

    @Override
    public List<OrderDTO> findAll() {
        return List.of();
    }

    @Override
    public void cancelOrder(Long id) {

    }
}
