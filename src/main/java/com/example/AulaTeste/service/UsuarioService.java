package com.example.AulaTeste.service;

import com.example.AulaTeste.model.Usuario;
import com.example.AulaTeste.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void cadastrar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> consultar() {
        return usuarioRepository.findAll();
    }

    public void atualizar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
