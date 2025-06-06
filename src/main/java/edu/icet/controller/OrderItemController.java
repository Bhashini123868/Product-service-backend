package edu.icet.controller;

import edu.icet.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-item")
@RequiredArgsConstructor
@CrossOrigin
public class OrderItemController {
    final OrderItemService service;
}
