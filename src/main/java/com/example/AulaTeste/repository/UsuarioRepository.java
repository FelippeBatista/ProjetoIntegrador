package com.example.AulaTeste.repository;

import com.example.AulaTeste.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}