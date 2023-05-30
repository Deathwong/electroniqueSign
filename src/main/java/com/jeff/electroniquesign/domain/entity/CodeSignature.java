package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "CodeSignature")
@Table(name = "code_signature")
@SequenceGenerator(name = "CodeSignatureIdGenerator", sequenceName = "code_signature_seq", allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CodeSignature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CodeSignatureIdGenerator")
    @Column(name = "cos_id")
    private Long id;

    @Column(name = "cos_code")
    private Long code;

    @Column(name = "cos_date_expiration")
    private LocalDate dateExpiration;

    @Column(name = "cos_statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "signa_id")
    private Signataire signataire;
}
