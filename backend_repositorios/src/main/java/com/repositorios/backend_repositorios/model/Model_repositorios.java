package com.repositorios.backend_repositorios.model;

import java.time.LocalDateTime;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="repositorios")
public class Model_repositorios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_referencia;
    private String nome_repositorio;
    private LocalDateTime data_criacao;
    private LocalDateTime data_publicacao;
    private String descricao;
    private String autor;

    public int getId_referencia() {
        return id_referencia;
    }
    public void setId_referencia(int id_referencia) {
        this.id_referencia = id_referencia;
    }
    public String getNome_repositorio() {
        return nome_repositorio;
    }
    public void setNome_repositorio(String nome_repositorio) {
        this.nome_repositorio = nome_repositorio;
    }
    public LocalDateTime getData_criacao() {
        return data_criacao;
    }
    public void setData_criacao(LocalDateTime data_criacao) {
        this.data_criacao = data_criacao;
    }
    public LocalDateTime getData_publicacao() {
        return data_publicacao;
    }
    public void setData_publicacao(LocalDateTime data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

}
