package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "Codesignature")
@Table(name = "code_signature", schema = "public")
@SequenceGenerator(name = "CodesignatureIdGenerator", sequenceName = "code_signature_seq", allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class CodeSignature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CodesignatureIdGenerator")
    @Column(name = "cos_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "signa_id")
    private Signataire signataire;

    @Column(name = "cos_code")
    private Long code;

    @Column(name = "cos_date_expiration")
    private LocalDate dateExpiration;

    @Column(name = "cos_statut")
    private String statut;
}
