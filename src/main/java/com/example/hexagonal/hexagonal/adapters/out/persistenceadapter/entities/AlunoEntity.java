package com.example.hexagonal.hexagonal.adapters.out.persistenceadapter.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "alunos")
@Entity
public class AlunoEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String rg;

}
