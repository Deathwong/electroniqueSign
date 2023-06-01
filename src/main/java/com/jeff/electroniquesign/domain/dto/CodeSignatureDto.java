package com.jeff.electroniquesign.domain.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.Instant;

public record CodeSignatureDto(

        @NotNull
        Long code,

        @NotNull
        @FutureOrPresent
        Instant dateExpiration,

        @NotEmpty
        @Size(max = 20, min = 5)
        String statut,

        @NotNull
        SignataireDto signataire
) {
}
