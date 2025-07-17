package org.example.atiperarekrutacja.models;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public record GithubResponseDTO(@NotBlank String repositoryName, @NotBlank String ownerLogin, List<LastCommitDTO> last) {}
