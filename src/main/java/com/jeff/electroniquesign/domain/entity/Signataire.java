package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Signataire")
@Table(name = "signataire")
@SequenceGenerator(name = "SignataireIdGenerator", sequenceName = "signataire_seq", allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Signataire {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SignataireIdGenerator")
    @Column(name = "signa_id")
    private Long id;

    @Column(name = "signa_nom")
    private String nom;

    @Column(name = "signa_prenom")
    private String prenom;

    @Column(name = "signa_email")
    private String email;

    @Column(name = "signa_telephone")
    private String telephone;

    @OneToMany(mappedBy = "signataire")
    List<Signature> signatures;

    @OneToMany(mappedBy = "signataire")
    List<CodeSignature> codeSignatures;

    @OneToMany(mappedBy = "signataire")
    List<DemandeSignature> DemandeSignatures;
}
