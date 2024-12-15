package com.example.ShopShoe.Reposiitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ShopShoe.Model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    PasswordResetToken findByToken(String token);
}
