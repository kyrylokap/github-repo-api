package org.example.atiperarekrutacja.models;

import jakarta.validation.constraints.NotBlank;

public record LastCommitDTO(@NotBlank String branchName, @NotBlank String lastCommitSha) {}
