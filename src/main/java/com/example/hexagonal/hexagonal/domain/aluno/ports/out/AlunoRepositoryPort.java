package com.example.hexagonal.hexagonal.domain.aluno.ports.out;

import com.example.hexagonal.hexagonal.domain.aluno.businessentities.Aluno;

public interface AlunoRepositoryPort {

    public void cadastrarAluno(Aluno aluno);
}
