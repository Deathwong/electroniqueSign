package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.Document;
import com.jeff.electroniquesign.domain.entity.Signataire;
import com.jeff.electroniquesign.domain.entity.Utilisateur;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public record DemandeSignatureDto(Long id, String statut, Instant dateDemande, LocalDate dateExpiration,
                                  Utilisateur utilisateur, Signataire signataire, List<Document> documents) {
}
