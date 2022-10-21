package com.ete.gerenciadorfuncionarios.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "gerenciador_funcionarios")
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "salario")
    private Double salario;
    @Column(name = "data_contratacao")
    private LocalDateTime dataContratacao = LocalDateTime.now();

    @Column(name = "funcionario_setor")
    @Enumerated(EnumType.STRING)
    private FuncionarioSetor setor;

    
    public void setSetor(FuncionarioSetor setor) {
        this.setor = setor;
    }
   
}
