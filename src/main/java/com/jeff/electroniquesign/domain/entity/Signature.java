package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "Signature")
@Table(name = "signature", schema = "public")
@SequenceGenerator(name = "UtilisateurIdGenerator", sequenceName = "signature_seq", allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Signature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UtilisateurIdGenerator")
    @Column(name = "sig_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "signa_id")
    private Signataire signataire;

    @Column(name = "sig_libelle")
    private String libelle;

    @Column(name = "sig_image")
    private String image;

    @Column(name = "sig_date_creation")
    private LocalDate dateCreation;
}
