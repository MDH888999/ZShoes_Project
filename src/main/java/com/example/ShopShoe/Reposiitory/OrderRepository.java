package com.example.ShopShoe.Reposiitory;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ShopShoe.Model.Order;
import com.example.ShopShoe.Model.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);

    @Query("SELECT SUM(o.totalPrice) FROM Order o")
    Double getTotalRevenue();
}
