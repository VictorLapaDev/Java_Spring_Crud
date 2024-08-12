package com.example.usuario.CadastroUsuario.controller;


import com.example.usuario.CadastroUsuario.modal.Usuario;
import com.example.usuario.CadastroUsuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @GetMapping
    public List<Usuario> getAll(){
        return  repository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Usuario> getById(@PathVariable Long id){
        return repository.findById(id);
    }

    @PostMapping
    public Usuario postUser(@RequestBody Usuario param){
        return repository.save(param);
    }

    @PutMapping("{id}")
    public Usuario updateUser(@PathVariable Long id, @RequestBody Usuario param){
        Usuario usernew = repository.findById(id).orElseThrow(() -> new RuntimeException("not found"));

        usernew.setEmail(param.getEmail());
        usernew.setNome(param.getNome());
        usernew.setSenha(param.getSenha());

        return repository.save(usernew);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Long id){
        repository.deleteById(id);
    }
}
