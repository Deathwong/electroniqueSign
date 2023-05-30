package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.Signataire;

import java.time.Instant;

public record CodeSignatureDto(Long id, Long code, Instant dateExpiration, String statut, Signataire signataire) {
}
