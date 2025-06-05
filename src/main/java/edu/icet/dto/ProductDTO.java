package edu.icet.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
    private Long id;

    @NotBlank(message = "Product name is required")
    private String name;

    @NotBlank(message = "Product type is required")
    private String type;

    @Size(max = 1000, message = "Description should be less than 1000 characters")
    private String description;

    @Positive(message = "Price must be a positive number")
    private double price;

    @Min(value = 0, message = "stock quantity cannot be negative")
    private int stockQty;

    @NotBlank(message = "Image URL is required")
    private String imageURL;
}
