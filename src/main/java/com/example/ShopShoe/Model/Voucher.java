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
@Table(name = "voucher")
public class Voucher implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voucher_id")
    private Long id;

    private String voucherName;
    private String voucherCode;

    private Double discountValue;

    private Double conditions;

    private Integer quantity;

    private Integer stock;

    private String dateStart;

    private String dateEnd;
}
