package com.example.projetobd.service;

import com.example.projetobd.models.Inscricao;
import com.example.projetobd.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscricaoService {
    @Autowired
    private InscricaoRepository inscricaoRepository;

    public Inscricao salvar(Inscricao inscricao) {
        return inscricaoRepository.save(inscricao);
    }

    public List<Inscricao> listarTodos() {
        return inscricaoRepository.findAll();
    }

    public Optional<Inscricao> buscarPorId(Long id) {
        return inscricaoRepository.findById(id);
    }

    public Inscricao atualizar(Long id, Inscricao inscricao) {
        inscricao.setId(id);
        return inscricaoRepository.save(inscricao);
    }

    public void deletar(Long id) {
        inscricaoRepository.deleteById(id);
    }
}
