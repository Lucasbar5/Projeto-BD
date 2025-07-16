package com.example.projetobd.service;

import com.example.projetobd.models.Certificado;
import com.example.projetobd.repository.CertificadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificadoService {
    @Autowired
    private CertificadoRepository certificadoRepository;

    public Certificado salvar(Certificado certificado) {
        return certificadoRepository.save(certificado);
    }

    public List<Certificado> listarTodos() {
        return certificadoRepository.findAll();
    }

    public Optional<Certificado> buscarPorId(Long id) {
        return certificadoRepository.findById(id);
    }

    public Certificado atualizar(Long id, Certificado certificado) {
        certificado.setId(id);
        return certificadoRepository.save(certificado);
    }

    public void deletar(Long id) {
        certificadoRepository.deleteById(id);
    }
}
