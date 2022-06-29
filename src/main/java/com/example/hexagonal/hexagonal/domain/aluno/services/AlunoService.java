package com.example.hexagonal.hexagonal.domain.aluno.services;

import com.example.hexagonal.hexagonal.domain.aluno.businessentities.Aluno;
import com.example.hexagonal.hexagonal.domain.aluno.ports.in.AlunoServicePort;
import com.example.hexagonal.hexagonal.domain.aluno.ports.out.AlunoRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AlunoService implements AlunoServicePort {

    private final AlunoRepositoryPort alunoRepositoryPort;

    @Override
    public void cadastrarAluno(Aluno aluno) {

        //Simulando alguma verificação de regra de negócio
        if(true) {
            System.out.println("regra de negócio atendida");
        }

        alunoRepositoryPort.cadastrarAluno(aluno);
    }
}
