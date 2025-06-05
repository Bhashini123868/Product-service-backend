package edu.icet.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
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

    @NotBlank(message = "Customer name is required")
    private String customerName;

    @NotNull(message = "Order date is required")
    private LocalDateTime date;

    @Positive(message = "Total must be a positive number")
    private double total;

    @NotEmpty(message = "Order must contain at least one item")
    private List<OrderItemDTO> items;
}
