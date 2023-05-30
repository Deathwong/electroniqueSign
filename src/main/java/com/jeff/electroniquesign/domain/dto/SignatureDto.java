package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.Signataire;

import java.time.Instant;

public record SignatureDto(Long id, String libelle, String image, Instant dateCreation, Signataire signataire) {
}
