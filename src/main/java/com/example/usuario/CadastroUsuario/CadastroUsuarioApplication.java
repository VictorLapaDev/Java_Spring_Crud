package com.example.usuario.CadastroUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.usuario.CadastroUsuario.modal.Usuario;

@SpringBootApplication(scanBasePackages = "com.example.usuario.CadastroUsuario.modal")
public class CadastroUsuarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroUsuarioApplication.class, args);
	}

}
