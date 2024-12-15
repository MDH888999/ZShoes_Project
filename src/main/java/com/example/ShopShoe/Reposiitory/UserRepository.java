package com.example.ShopShoe.Reposiitory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShopShoe.Model.User;

import java.util.List;
import java.util.Optional;

//crud: create, read, update, delete
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User eric);

    void deleteById(long id);

    List<User> findOneByEmail(String email);

    Page<User> findAll(Pageable page);

    User findById(long id); // null

    boolean existsByEmail(String email);

    User findByEmail(String email);

    // Optional<User> UserfindByEmail(String email);
}