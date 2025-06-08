package edu.icet.controller;

import edu.icet.dto.LowStockProductDTO;
import edu.icet.service.LowStockProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock-product")
@RequiredArgsConstructor
@CrossOrigin
public class LowStockProductController {
    final LowStockProductService service;

    public ResponseEntity<List<LowStockProductDTO>> getLowStockProducts(@PathVariable int threshould){
        List<LowStockProductDTO> lowStockProducts = service.findLowStockProducts(threshould);
        return ResponseEntity.ok(lowStockProducts);
    }

}


