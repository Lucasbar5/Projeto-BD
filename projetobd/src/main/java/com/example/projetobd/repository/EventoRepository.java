package com.example.projetobd.repository;

import com.example.projetobd.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
