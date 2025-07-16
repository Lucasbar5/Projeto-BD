package com.example.projetobd.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String local;

    @Enumerated(EnumType.STRING)
    private StatusEvento status;

    @ManyToOne
    private Usuario organizador;

    @OneToMany(mappedBy = "evento")
    private List<Palestra> palestras;

    @OneToMany(mappedBy = "evento")
    private List<Inscricao> inscricoes;
}
