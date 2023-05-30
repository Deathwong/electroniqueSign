package com.jeff.electroniquesign.domain.dto;

import com.jeff.electroniquesign.domain.entity.CodeSignature;
import com.jeff.electroniquesign.domain.entity.DemandeSignature;
import com.jeff.electroniquesign.domain.entity.Signature;

import java.util.List;

public record SignataireDto(Long id, String nom, String prenom, String email, String telephone,
                            List<Signature> signatures, List<CodeSignature> codeSignatures,
                            List<DemandeSignature> DemandeSignatures) {
}
