package com.jeff.electroniquesign.domain.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AbstractResponse {
    private Integer statut;
    private Instant date;
    private String message;
}
