package com.example.logistique.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "marketplace_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MarketplaceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    private String description;

    private Double prix;

    @Enumerated(EnumType.STRING)
    private MarketplaceStatus status;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    @ManyToOne
    @JoinColumn(name = "vendeur_id")
    private User vendeur;

    @ManyToOne
    @JoinColumn(name = "acheteur_id")
    private User acheteur;
}