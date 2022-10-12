package com.G13.repo;

import com.G13.domain.Favorite;
import com.G13.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}