package edu.icet.controller;

import edu.icet.service.LowStockProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-product")
@RequiredArgsConstructor
@CrossOrigin
public class LowStockProductController {
    final LowStockProductService service;
}


