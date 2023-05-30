package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "Utilisateur")
@Table(name = "utilisateur")
@SequenceGenerator(name = "UtilisateurIdGenerator", sequenceName = "utilisateur_seq", allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UtilisateurIdGenerator")
    @Column(name = "uti_id")
    private Long id;

    @Column(name = "uti_nom")
    private String nom;

    @Column(name = "uti_prenom")
    private String prenom;

    @Column(name = "uti_email")
    private String email;

    @Column(name = "uti_mot_de_passe")
    private String motDePasse;

    @OneToMany(mappedBy = "utilisateur")
    private List<DemandeSignature> DemandeSignatures;
}
