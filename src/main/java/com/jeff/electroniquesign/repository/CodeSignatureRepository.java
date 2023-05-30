package com.jeff.electroniquesign.repository;

import com.jeff.electroniquesign.domain.entity.CodeSignature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeSignatureRepository extends JpaRepository<CodeSignature, Long> {
}
