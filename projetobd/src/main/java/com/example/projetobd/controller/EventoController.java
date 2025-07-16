package com.example.projetobd.controller;

import com.example.projetobd.models.Evento;
import com.example.projetobd.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {
    @Autowired
    private EventoService service;

    @PostMapping
    public ResponseEntity<Evento> criar(@RequestBody Evento evento) {
        return ResponseEntity.ok(service.salvar(evento));
    }

    @GetMapping
    public ResponseEntity<List<Evento>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> atualizar(@PathVariable Long id, @RequestBody Evento evento) {
        return ResponseEntity.ok(service.atualizar(id, evento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
