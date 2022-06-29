package com.example.hexagonal.hexagonal.adapters.out.persistenceadapter.repositories;

import com.example.hexagonal.hexagonal.adapters.out.persistenceadapter.entities.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
}
