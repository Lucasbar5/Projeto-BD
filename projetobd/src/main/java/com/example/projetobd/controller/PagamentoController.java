package com.example.projetobd.controller;

import com.example.projetobd.models.Pagamento;
import com.example.projetobd.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {
    @Autowired
    private PagamentoService service;

    @PostMapping
    public ResponseEntity<Pagamento> criar(@RequestBody Pagamento pagamento) {
        return ResponseEntity.ok(service.salvar(pagamento));
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pagamento> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pagamento> atualizar(@PathVariable Long id, @RequestBody Pagamento pagamento) {
        return ResponseEntity.ok(service.atualizar(id, pagamento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
