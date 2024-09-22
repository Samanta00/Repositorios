package com.repositorios.backend_repositorios.controller;

import org.springframework.web.bind.annotation.RestController;
import com.repositorios.backend_repositorios.model.Model_repositorios;
import com.repositorios.backend_repositorios.repository.RepositoryRegister; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RepositoriosController {

    @Autowired
    private RepositoryRegister repositorio;
    @GetMapping("/")
    public String mensagem() {
        return "hello world";
    }

    // Cadastro de repositório
    @PostMapping("/cadastro")
    public ResponseEntity<String> cadastrarRepositorio(@RequestBody Model_repositorios repositorioDados) {
        Model_repositorios novoRepositorio = repositorio.save(repositorioDados);
        return ResponseEntity.ok("Repositório salvo com ID: " + novoRepositorio.getId_referencia());
    }

    // Listar todos os repositórios
    @GetMapping("/view")
    public List<Model_repositorios> listarTodos() {
        return repositorio.findAll();
    }

    // Buscar repositório por ID
    @GetMapping("/view/{id}")
    public ResponseEntity<Model_repositorios> buscarRepositorioPorId(@PathVariable int id) {
        Optional<Model_repositorios> repositorioOpt = repositorio.findById(id);
        if (repositorioOpt.isPresent()) {
            return ResponseEntity.ok(repositorioOpt.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Atualizar repositório por ID
    @PutMapping("/view/{id}")
    public ResponseEntity<String> atualizarRepositorio(@PathVariable int id, @RequestBody Model_repositorios repositorioAtualizado) {
        Optional<Model_repositorios> repositorioOpt = repositorio.findById(id);
        if (repositorioOpt.isPresent()) {
            Model_repositorios repositorioExistente = repositorioOpt.get();
            repositorioExistente.setNome_repositorio(repositorioAtualizado.getNome_repositorio());
            repositorioExistente.setData_criacao(repositorioAtualizado.getData_criacao());
            repositorioExistente.setData_publicacao(repositorioAtualizado.getData_publicacao());
            repositorioExistente.setDescricao(repositorioAtualizado.getDescricao());
            repositorioExistente.setAutor(repositorioAtualizado.getAutor());

            Model_repositorios repositorioSalvo = repositorio.save(repositorioExistente);
            return ResponseEntity.ok("Repositório atualizado com ID: " + repositorioSalvo.getId_referencia());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Deletar repositório por ID
    @DeleteMapping("/view/{id}")
    public ResponseEntity<String> deletarRepositorio(@PathVariable int id) {
        Optional<Model_repositorios> repositorioOpt = repositorio.findById(id);
        if (repositorioOpt.isPresent()) {
            repositorio.delete(repositorioOpt.get());
            return ResponseEntity.ok("Repositório deletado com ID: " + id);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/teste")
    public String testeMensagem() {
        return "Teste funcionou";
    }

}
