package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;

import java.time.Instant;

public record DocumentDto(Long id, String nom, Instant dateCreation, String statut, DemandeSignature demandeSignature) {
}
