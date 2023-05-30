package com.jeff.electroniquesign.domain.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity(name = "Document")
@Table(name = "document")
@SequenceGenerator(name = "DocumentIdGenerator", sequenceName = "document_seq", allocationSize = 1)
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DocumentIdGenerator")
    @Column(name = "doc_id")
    private Long id;

    @Column(name = "doc_nom")
    private String nom;

    @Column(name = "doc_date_creation")
    private Instant dateCreation;

    @Column(name = "doc_statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "des_id")
    private DemandeSignature DemandeSignature;
}
