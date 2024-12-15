package com.example.ShopShoe.Model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PasswordResetToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private LocalDateTime createdAt;

    @ManyToOne
    private User user;

    public boolean isExpired() {
        return this.createdAt.plusHours(1).isBefore(LocalDateTime.now());
    }

}
