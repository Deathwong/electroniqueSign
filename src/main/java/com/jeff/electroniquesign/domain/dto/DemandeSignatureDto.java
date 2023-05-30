package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.Document;
import com.jeff.electroniquesign.domain.entity.Signataire;
import com.jeff.electroniquesign.domain.entity.Utilisateur;
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
        Utilisateur utilisateur,

        @NotNull
        Signataire signataire,

        @NotNull
        List<Document> documents
) {
}
