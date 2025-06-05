package edu.icet.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class LowStockProductDTO {

    @NotBlank(message = "Product name is required")
    private String name;

    @Min(value = 0, message = "Stock quantity cannot be negative")
    private int stockQty;
}
