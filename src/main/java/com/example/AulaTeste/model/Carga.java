package com.example.AulaTeste.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "usuario")
public class Carga {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(name = "produto")
    private String produto;
    @Column(name = "tipocarga")
    private String tipocarga;
    @Column(name = "quantidade")
    private float quantidade;
    @Column(name = "peso")
    private float peso;
    @Column(name = "origem")
    private String origem;
    @Column(name = "destino")
    private String destino;

    public Carga(){}
    public Carga(String produto, String tipocarga, float quantidade, float peso, String origem, String destino){
        this.produto = produto;
        this.tipocarga = tipocarga;
        this.quantidade = quantidade;
        this.peso = peso;
        this.origem = origem;
        this.destino = destino;
    }

}