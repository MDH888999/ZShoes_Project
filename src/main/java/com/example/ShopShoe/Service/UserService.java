package com.example.ShopShoe.Service;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ShopShoe.Model.Role;
import com.example.ShopShoe.Model.User;
import com.example.ShopShoe.Model.dto.RegisterDTO;
import com.example.ShopShoe.Reposiitory.OrderRepository;
import com.example.ShopShoe.Reposiitory.PasswordResetTokenRepository;
import com.example.ShopShoe.Reposiitory.ProductRepository;
import com.example.ShopShoe.Reposiitory.RoleRepository;
import com.example.ShopShoe.Reposiitory.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;

    public UserService(UserRepository userRepository,
            RoleRepository roleRepository,
            ProductRepository productRepository,
            OrderRepository orderRepository,
            PasswordResetTokenRepository tokenRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.productRepository = productRepository;
        this.orderRepository = orderRepository;
    }

    public Page<User> getAllUsers(Pageable page) {
        return this.userRepository.findAll(page);
    }

    public List<User> getAllUsersByEmail(String email) {
        return this.userRepository.findOneByEmail(email);
    }

    public User handleSaveUser(User user) {
        User eric = this.userRepository.save(user);
        System.out.println(eric);
        return eric;
    }

    public User getUserById(long id) {
        return this.userRepository.findById(id);
    }

    public void deleteAUser(long id) {
        this.userRepository.deleteById(id);
    }

    public Role getRoleByName(String name) {
        return this.roleRepository.findByName(name);
    }

    public User registerDTOtoUser(RegisterDTO registerDTO) {
        User user = new User();
        user.setFullName(registerDTO.getFirstName() + " " + registerDTO.getLastName());
        user.setEmail(registerDTO.getEmail());
        user.setPassword(registerDTO.getPassword());
        return user;
    }

    public boolean checkEmailExist(String email) {
        return this.userRepository.existsByEmail(email);
    }

    public User getUserByEmail(String email) {
        return this.userRepository.findByEmail(email);
    }

    public long countUsers() {
        return this.userRepository.count();
    }

    public long countProducts() {
        return this.productRepository.count();
    }

    public long countOrders() {
        return this.orderRepository.count();
    }

    // // Generate reset token
    // public String generatePasswordResetToken(User user) {
    // String token = UUID.randomUUID().toString();
    // PasswordResetToken resetToken = new PasswordResetToken(token, user);
    // tokenRepository.save(resetToken);
    // return token;
    // }

    // // Validate token and check if it's expired
    // public Optional<User> validatePasswordResetToken(String token) {
    // PasswordResetToken resetToken = tokenRepository.findByToken(token);
    // if (resetToken == null || resetToken.isExpired()) {
    // return Optional.empty();
    // }
    // return Optional.of(resetToken.getUser());
    // }

    // // Update password after token validation
    // public void updatePassword(User user, String newPassword) {
    // user.setPassword(passwordEncoder.encode(newPassword));
    // userRepository.save(user);
    // }
}
