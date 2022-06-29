package com.example.hexagonal.hexagonal.adapters.out.persistenceadapter.repositoriesadapterImpl;

import com.example.hexagonal.hexagonal.adapters.out.persistenceadapter.entities.AlunoEntity;
import com.example.hexagonal.hexagonal.adapters.out.persistenceadapter.repositories.AlunoRepository;
import com.example.hexagonal.hexagonal.domain.aluno.businessentities.Aluno;
import com.example.hexagonal.hexagonal.domain.aluno.ports.out.AlunoRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AlunoRepositoryAdapterImpl implements AlunoRepositoryPort {

    private final AlunoRepository alunoRepository;

    @Override
    public void cadastrarAluno(Aluno aluno) {
        AlunoEntity alunoEntity = mapToEntity(aluno);
        alunoRepository.save(alunoEntity);
    }

    private AlunoEntity mapToEntity(Aluno aluno) {
        AlunoEntity alunoEntity = new AlunoEntity();

        alunoEntity.setNome(aluno.getNome());
        alunoEntity.setCpf(aluno.getCpf());
        alunoEntity.setRg(aluno.getRg());

        return alunoEntity;
    }
}
