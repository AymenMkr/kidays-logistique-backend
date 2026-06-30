package com.example.logistique.repository;

import com.example.logistique.entity.MarketplaceItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketplaceItemRepository extends JpaRepository<MarketplaceItem, Long> {
}