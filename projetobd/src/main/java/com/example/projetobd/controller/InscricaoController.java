package com.example.projetobd.controller;


import com.example.projetobd.models.Inscricao;
import com.example.projetobd.service.InscricaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscricoes")
public class InscricaoController {
    @Autowired
    private InscricaoService service;

    @PostMapping
    public ResponseEntity<Inscricao> criar(@RequestBody Inscricao inscricao) {
        return ResponseEntity.ok(service.salvar(inscricao));
    }

    @GetMapping
    public ResponseEntity<List<Inscricao>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inscricao> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inscricao> atualizar(@PathVariable Long id, @RequestBody Inscricao inscricao) {
        return ResponseEntity.ok(service.atualizar(id, inscricao));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
