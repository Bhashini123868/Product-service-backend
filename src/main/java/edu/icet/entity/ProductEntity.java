package edu.icet.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String type;

    @Column(length = 1000)
    private String description;

    private double price;

    @Column(name = "stock_qty")
    private int stockQty;

    @Column(name = "image_url")
    private String imageURL;
}
