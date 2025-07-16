package com.example.projetobd.service;

import com.example.projetobd.models.Pagamento;
import com.example.projetobd.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository pagamentoRepository;


    public Pagamento salvar(Pagamento pagamento) {
        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> listarTodos() {
        return pagamentoRepository.findAll();
    }

    public Optional<Pagamento> buscarPorId(Long id) {
        return pagamentoRepository.findById(id);
    }

    public Pagamento atualizar(Long id, Pagamento pagamento) {
        pagamento.setId(id);
        return pagamentoRepository.save(pagamento);
    }

    public void deletar(Long id) {
        pagamentoRepository.deleteById(id);
    }
}
