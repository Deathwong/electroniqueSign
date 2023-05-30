package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;

import java.util.List;

public record UtilisateurDto(Long id, String nom, String prenom, String email,
                             List<DemandeSignature> DemandeSignatures) {
}
