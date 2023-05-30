package com.jeff.electroniquesign.repository;

import com.jeff.electroniquesign.domain.entity.Signature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignatureRepository extends JpaRepository<Signature, Long> {
}
