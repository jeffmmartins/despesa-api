package com.github.jeffmmartins.despesas_API.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tb_despesa")
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;

    public Despesa(){

    }

    public Despesa(String descricao, BigDecimal valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
    }



    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
