package edu.icet.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class LowStockProductDTO {
    private String name;
    private int stockQty;
}
