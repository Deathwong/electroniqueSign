package com.jeff.electroniquesign.domain.dto;

import jakarta.validation.constraints.*;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public record DemandeSignatureDto(

        @NotEmpty
        @Size(max = 20, min = 5)
        String statut,

        @NotNull
        @PastOrPresent
        Instant dateDemande,

        @NotNull
        @FutureOrPresent
        LocalDate dateExpiration,

        @NotNull
        UtilisateurDto utilisateur,

        @NotNull
        SignataireDto signataire,
        
        List<@NotNull DocumentDto> documents
) {
}
