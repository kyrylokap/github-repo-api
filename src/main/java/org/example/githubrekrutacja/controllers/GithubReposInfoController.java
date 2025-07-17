package org.example.atiperarekrutacja.controllers;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/repositories")
public class GithubReposInfoController {

    @GetMapping("/{login}")
    public ResponseEntity<?> getReposInfo(@PathVariable String login){
        return ResponseEntity.ok(login);
    }
}
