package com.example.projetobd.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Palestra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDateTime horarioInicio;
    private LocalDateTime horarioFim;
    private String sala;

    @ManyToOne
    private Usuario palestrante;

    @ManyToOne
    private Evento evento;
}
