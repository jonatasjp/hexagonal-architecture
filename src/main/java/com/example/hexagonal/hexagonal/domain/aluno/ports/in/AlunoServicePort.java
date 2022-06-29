package com.example.hexagonal.hexagonal.domain.aluno.ports.in;

import com.example.hexagonal.hexagonal.domain.aluno.businessentities.Aluno;

public interface AlunoServicePort {

    public void cadastrarAluno(Aluno aluno);
}
