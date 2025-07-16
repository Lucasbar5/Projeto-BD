package com.example.projetobd.controller;

import com.example.projetobd.models.Certificado;
import com.example.projetobd.service.CertificadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/certificados")
public class CertificadoController {
    @Autowired
    private CertificadoService service;

    @PostMapping
    public ResponseEntity<Certificado> criar(@RequestBody Certificado certificado) {
        return ResponseEntity.ok(service.salvar(certificado));
    }

    @GetMapping
    public ResponseEntity<List<Certificado>> listar() {
        return ResponseEntity.ok(service.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Certificado> buscar(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certificado> atualizar(@PathVariable Long id, @RequestBody Certificado certificado) {
        return ResponseEntity.ok(service.atualizar(id, certificado));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
