package com.example.AulaTeste.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "usuario")
public class Usuario {
    @Id()
    @GeneratedValue()
    private UUID codigo_usuario;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
    @Column(name = "NomeDaEmpresa")
    private String NomeDaEmpresa;
    @Column(name = "NomeNavio")
    private String NomeNavio;
    @Column(name = "TipoCarga")
    private String TipoCarga;

    public Usuario(){}
    public Usuario(String nome, String email, String senha, String NomeDaEmpresa, String NomeNavio, String TipoCarga){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.NomeDaEmpresa = NomeDaEmpresa;
        this.NomeNavio = NomeNavio;
        this.TipoCarga = TipoCarga;
    }

}


