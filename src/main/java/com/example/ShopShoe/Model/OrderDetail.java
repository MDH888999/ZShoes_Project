package com.example.ShopShoe.Model;

import java.io.Serializable;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long quantity;
    private double price;

    // order_id: long
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    // product_id: long
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
