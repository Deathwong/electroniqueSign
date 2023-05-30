package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.Instant;

public record DocumentDto(

        @NotEmpty
        @Size(max = 100, min = 3)
        String nom,

        @NotNull
        @PastOrPresent
        Instant dateCreation,

        @NotEmpty
        @Size(min = 5, max = 20)
        String statut,

        @NotNull
        DemandeSignature demandeSignature
) {
}
