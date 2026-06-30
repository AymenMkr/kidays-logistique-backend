package com.example.logistique.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "loans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDebut;

    private LocalDate dateRetourPrevue;

    private LocalDate dateRetourReelle;

    @Enumerated(EnumType.STRING)
    private LoanStatus status;

    private String commentaire;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User animateur;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;
}