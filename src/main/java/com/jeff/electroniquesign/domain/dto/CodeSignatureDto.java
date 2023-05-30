package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.Signataire;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

public record CodeSignatureDto(Long id, @NotNull Long code, @NotNull @FutureOrPresent Instant dateExpiration, @NotBlank
@Size(max = 20, min = 5) String statut, @NotNull Signataire signataire) {
}
