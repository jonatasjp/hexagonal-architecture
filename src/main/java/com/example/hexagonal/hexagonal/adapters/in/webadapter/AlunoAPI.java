package com.example.hexagonal.hexagonal.adapters.in.webadapter;

import com.example.hexagonal.hexagonal.domain.aluno.businessentities.Aluno;
import com.example.hexagonal.hexagonal.domain.aluno.ports.in.AlunoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/aluno")
public class AlunoAPI {

    private final AlunoServicePort alunoServicePort;

    @PostMapping
    public ResponseEntity<String> cadastrarAluno(@RequestBody Aluno aluno) throws Exception{

        System.out.println(aluno);

        alunoServicePort.cadastrarAluno(aluno);

        return ResponseEntity.ok("Aluno cadastrado com sucesso!");
    }
}
