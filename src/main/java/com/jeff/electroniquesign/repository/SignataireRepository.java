package com.jeff.electroniquesign.repository;

import com.jeff.electroniquesign.domain.entity.Signataire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignataireRepository extends JpaRepository<Signataire, Long> {
}
