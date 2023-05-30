package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.Instant;

public record DocumentDto(Long id, @NotBlank @Size(max = 100, min = 3) String nom,
                          @NotNull @PastOrPresent Instant dateCreation,
                          @NotBlank @Size(min = 5, max = 20) String statut,
                          @NotNull DemandeSignature demandeSignature) {
}
