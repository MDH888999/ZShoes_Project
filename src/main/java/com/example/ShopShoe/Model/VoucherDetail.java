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
@Table(name = "voucherDetail")
public class VoucherDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voucherDetail_id")
    private long id;

    private Long ordersID;

    @ManyToOne
    @JoinColumn(name = "voucher_id")
    private Voucher voucher;

}