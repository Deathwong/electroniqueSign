package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "DemandeSignature")
@Table(name = "demande_signature")
@SequenceGenerator(name = "DemandeSignatureIdGenerator", sequenceName = "demande_signature_seq", allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class DemandeSignature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DemandeSignatureIdGenerator")
    @Column(name = "des_id")
    private Long id;

    @Column(name = "des_statut")
    private String statut;

    @Column(name = "des_date_demande")
    private LocalDate dateDemande;

    @Column(name = "des_date_expiration")
    private LocalDate dateExpiration;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uti_id")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "signa_id")
    private Signataire signataire;

    @OneToMany(mappedBy = "DemandeSignature")
    List<Document> documents;
}
