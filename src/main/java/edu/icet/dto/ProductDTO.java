package edu.icet.dto;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDTO {
    private Long id;
    private String name;
    private String type;
    private String description;
    private double price;
    private int stockQty;
    private String imageURL;
}
