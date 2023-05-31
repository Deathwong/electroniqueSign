package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.CodeSignature;
import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import com.jeff.electroniquesign.domain.entity.Signature;
import jakarta.validation.constraints.*;

import java.util.List;

public record SignataireDto(

        @NotEmpty
        @Min(value = 3)
        @Max(value = 50)
        String nom,

        @NotEmpty
        @Min(value = 3)
        @Max(value = 50)
        String prenom,

        @NotEmpty
        @Email
        @Min(value = 5)
        @Max(value = 255)
        String email,

        @NotEmpty
        @Max(value = 20)
        @Pattern(regexp = "\\b(?:\\+?\\d{1,3}[-.\\s]?)?(?:\\(?)0[67]\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\b")
        String telephone,

        List<@NotNull Signature> signatures,

        @NotNull
        List<CodeSignature> codeSignatures,

        @NotNull
        List<DemandeSignature> DemandeSignatures
) {
}
