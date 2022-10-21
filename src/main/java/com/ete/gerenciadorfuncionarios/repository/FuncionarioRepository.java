package com.ete.gerenciadorfuncionarios.repository;

import java.util.List;

import com.ete.gerenciadorfuncionarios.model.Funcionario;
import com.ete.gerenciadorfuncionarios.model.FuncionarioSetor;
import org.springframework.data.jpa.repository.JpaRepository;



public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
