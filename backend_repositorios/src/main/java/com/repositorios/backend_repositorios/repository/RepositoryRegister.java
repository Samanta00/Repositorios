package com.repositorios.backend_repositorios.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

import com.repositorios.backend_repositorios.model.*;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface RepositoryRegister extends JpaRepository<Model_repositorios, Integer> {
    
    @Query("SELECT r FROM Model_repositorios r WHERE r.nome_repositorio = :nome_repositorio")
    List<Model_repositorios> listarTodos(@Param("nome_repositorio") String nome_repositorio);
}
