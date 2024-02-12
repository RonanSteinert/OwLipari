package com.example.OwLipari.BE.Repository;

import com.example.OwLipari.BE.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
