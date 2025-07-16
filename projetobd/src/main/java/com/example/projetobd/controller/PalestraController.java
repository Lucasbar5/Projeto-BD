package com.example.projetobd.controller;

import com.example.projetobd.models.Palestra;
import com.example.projetobd.service.PalestraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/palestras")

public class PalestraController {
    @Autowired
    private PalestraService service;

    @PostMapping
    public ResponseEntity<Palestra> criar(@RequestBody Palestra palestra) {
        return ResponseEntity.ok(service.salvar(palestra));
    }

    @GetMapping
    public ResponseEntity<List<Palestra>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Palestra> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Palestra> atualizar(@PathVariable Long id, @RequestBody Palestra palestra) {
        return ResponseEntity.ok(service.atualizar(id, palestra));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
