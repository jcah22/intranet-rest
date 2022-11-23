package com.intranet.intranet.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intranet.intranet.models.Usuario;
import com.intranet.intranet.service.IUsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api")
public class RestUsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> usuariosTodos() {
        List<Usuario> usuarios = usuarioService.listarTodosLosUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping({ "usuarios/{id}" })
    public ResponseEntity<?> usuarioPorId(@PathVariable Long id) {
        return new ResponseEntity<>(usuarioService.buscarUsuarioPorId(id), HttpStatus.OK);
    }

    @PostMapping("/usuarios")
    public ResponseEntity<?> guardarUsuario(@RequestBody Usuario usuario) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioService.guardarUsuario(usuario));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping({ "usuarios/{id}" })
    public ResponseEntity<?> actualizarEmpresa(@PathVariable Long id, @RequestBody Usuario usuario) {
        usuarioService.actualizarUsuario(id, usuario);
        return new ResponseEntity<>(usuarioService.buscarUsuarioPorId(id), HttpStatus.OK);
    }

    @DeleteMapping({ "usuarios/{id}" })
    public ResponseEntity<?> borrarUsuarioPorId(@PathVariable("id") Long id) {
        usuarioService.eliminarUsuarioPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
