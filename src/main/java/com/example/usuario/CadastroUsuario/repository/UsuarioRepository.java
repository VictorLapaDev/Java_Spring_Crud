package com.example.usuario.CadastroUsuario.repository;

import com.example.usuario.CadastroUsuario.modal.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
