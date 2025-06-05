package edu.icet.service;

import edu.icet.dto.OrderItemDTO;

import java.util.List;

public interface OrderItemService {
    OrderItemDTO save(OrderItemDTO orderItemDTO);
    OrderItemDTO update(Long id, OrderItemDTO orderItemDTO);
    void delete(Long id);
    OrderItemDTO findById(Long id);
    List<OrderItemDTO> findAll();
}
