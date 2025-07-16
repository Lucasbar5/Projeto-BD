package com.example.projetobd.models;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Inscricao inscricao;

    private BigDecimal valor;
    private LocalDate dataPagamento;

    @Enumerated(EnumType.STRING)
    private MetodoPagamento metodoPagamento;

    @Enumerated(EnumType.STRING)
    private StatusPagamento status;
}
