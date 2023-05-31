package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.CodeSignature;
import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import com.jeff.electroniquesign.domain.entity.Signature;
import jakarta.validation.constraints.*;

import java.util.List;

public record SignataireDto(

        @NotEmpty
        @Size(max = 50, min = 3)
        String nom,

        @NotEmpty
        @Size(max = 50, min = 3)
        String prenom,

        @NotEmpty
        @Email
        @Size(max = 255, min = 5)
        String email,

        @NotEmpty
        @Size(max = 20)
        @Pattern(regexp = "\\b(?:\\+?\\d{1,3}[-.\\s]?)?(?:\\(?)0[67]\\s\\d{2}\\s\\d{2}\\s\\d{2}\\s\\d{2}\\b")
        String telephone,

        List<@NotNull Signature> signatures,

        @NotNull
        List<CodeSignature> codeSignatures,

        @NotNull
        List<DemandeSignature> DemandeSignatures
) {
}
