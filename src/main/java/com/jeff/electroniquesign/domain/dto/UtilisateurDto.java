package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import jakarta.validation.constraints.*;

import java.util.List;

public record UtilisateurDto(

        @NotBlank
        @Min(value = 3)
        @Max(value = 50)
        String nom,

        @NotBlank
        @Min(value = 3)
        @Max(value = 50)
        String prenom,

        @NotBlank
        @Email
        @Min(value = 5)
        @Max(value = 255)
        String email,

        @NotBlank
        @Min(value = 5)
        @Max(value = 255)
        String motDePasse,

        @NotNull
        List<DemandeSignature> DemandeSignatures
) {
}
