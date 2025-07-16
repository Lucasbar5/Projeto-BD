package com.example.projetobd.service;

import com.example.projetobd.models.Evento;
import com.example.projetobd.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {
    @Autowired
    private EventoRepository eventoRepository;

    public Evento salvar(Evento evento) {
        return eventoRepository.save(evento);
    }

    public List<Evento> listarTodos() {
        return eventoRepository.findAll();
    }

    public Optional<Evento> buscarPorId(Long id) {
        return eventoRepository.findById(id);
    }

    public Evento atualizar(Long id, Evento evento) {
        evento.setId(id);
        return eventoRepository.save(evento);
    }

    public void deletar(Long id) {
        eventoRepository.deleteById(id);
    }
}
