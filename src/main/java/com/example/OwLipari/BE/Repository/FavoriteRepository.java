package com.example.OwLipari.BE.Repository;

import com.example.OwLipari.BE.Model.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
}
