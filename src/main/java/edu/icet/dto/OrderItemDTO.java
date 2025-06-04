package edu.icet.dto;

import lombok.*;

@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemDTO {
    private Long productId;
    private int quantity;
}
