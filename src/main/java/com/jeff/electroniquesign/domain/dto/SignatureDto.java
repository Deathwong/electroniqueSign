package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.Signataire;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.Instant;

public record SignatureDto(

        @NotEmpty
        @Max(value = 100)
        String libelle,

        @NotEmpty
        String image,

        @NotNull
        @PastOrPresent
        Instant dateCreation,

        @NotNull
        Signataire signataire
) {
}
