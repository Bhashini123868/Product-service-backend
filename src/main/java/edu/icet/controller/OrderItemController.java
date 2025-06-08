package edu.icet.controller;

import edu.icet.dto.OrderItemDTO;
import edu.icet.service.OrderItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order-item")
@RequiredArgsConstructor
@CrossOrigin
public class OrderItemController {
    final OrderItemService service;

    @PostMapping
    public ResponseEntity<OrderItemDTO> save(@RequestBody OrderItemDTO orderItemDTO){
        return ResponseEntity.ok(service.save(orderItemDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderItemDTO> update(@PathVariable Long id, @RequestBody OrderItemDTO orderItemDTO){
        return ResponseEntity.ok(service.update(id, orderItemDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItemDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<OrderItemDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
