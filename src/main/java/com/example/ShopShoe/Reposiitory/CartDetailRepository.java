package com.example.ShopShoe.Reposiitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShopShoe.Model.Cart;
import com.example.ShopShoe.Model.CartDetail;
import com.example.ShopShoe.Model.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {

    boolean existsByCartAndProduct(Cart car, Product product);

    CartDetail findByCartAndProduct(Cart car, Product product);

}
