package edu.icet.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDTO {
    private Long id;
    private String customerName;
    private LocalDateTime date;
    private double total;
    private List<OrderItemDTO> items;
}
