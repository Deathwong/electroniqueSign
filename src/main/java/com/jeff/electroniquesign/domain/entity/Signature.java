package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity(name = "Signature")
@Table(name = "signature")
@SequenceGenerator(name = "SignatureIdGenerator", sequenceName = "signature_seq", allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Signature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SignatureIdGenerator")
    @Column(name = "sig_id")
    private Long id;

    @Column(name = "sig_libelle")
    private String libelle;

    @Column(name = "sig_image")
    private String image;

    @Column(name = "sig_date_creation")
    private Instant dateCreation;

    @ManyToOne
    @JoinColumn(name = "signa_id")
    private Signataire signataire;
}
