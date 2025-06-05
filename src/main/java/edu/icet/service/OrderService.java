package edu.icet.service;

import edu.icet.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    OrderDTO placeOrder(OrderDTO orderDTO);
    OrderDTO findById(Long id);
    List<OrderDTO> findAll();
    void cancelOrder(Long id);
}
