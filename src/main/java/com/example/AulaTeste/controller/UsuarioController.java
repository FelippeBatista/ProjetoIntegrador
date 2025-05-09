package com.example.AulaTeste.controller;

import com.example.AulaTeste.model.Usuario;
import com.example.AulaTeste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public void cadastrar(@RequestBody Usuario usuario) {
        usuarioService.cadastrar(usuario);
    }

    @GetMapping("/")
    public List<Usuario> consultar() {
        return usuarioService.consultar();
    }

    @PutMapping("/")
    public void atualizar(@RequestBody Usuario usuario) {
        usuarioService.atualizar(usuario);
    }
}
