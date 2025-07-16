package com.example.projetobd.service;

import com.example.projetobd.models.Palestra;
import com.example.projetobd.repository.PalestraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PalestraService {
    @Autowired
    private PalestraRepository palestraRepository;

    public Palestra salvar(Palestra palestra) {
        return palestraRepository.save(palestra);
    }

    public List<Palestra> listarTodos() {
        return palestraRepository.findAll();
    }

    public Optional<Palestra> buscarPorId(Long id) {
        return palestraRepository.findById(id);
    }

    public Palestra atualizar(Long id, Palestra palestra) {
        palestra.setId(id);
        return palestraRepository.save(palestra);
    }

    public void deletar(Long id) {
        palestraRepository.deleteById(id);
    }
}
