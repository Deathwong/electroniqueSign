package com.jeff.electroniquesign.domain.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.Instant;

public record SignatureDto(

        @Size(max = 100)
        String libelle,

        Byte[] image,

        @NotNull
        @PastOrPresent
        Instant dateCreation,

        @NotNull
        SignataireDto signataire
) {
}
