package com.example.ShopShoe.Reposiitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.ShopShoe.Model.Voucher;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher, Long> {

}
