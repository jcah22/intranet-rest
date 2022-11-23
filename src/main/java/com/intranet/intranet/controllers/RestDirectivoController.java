package com.intranet.intranet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intranet.intranet.models.Directivo;
import com.intranet.intranet.service.IDirectivoService;

@RestController
@RequestMapping("/api")
public class RestDirectivoController {

    @Autowired
    private IDirectivoService directivoService;


    @GetMapping("/directivos")
    public ResponseEntity<List<Directivo>> listarDirectivos() {
        List<Directivo> directivos = directivoService.listarTodosLosDirectivos();
        return new ResponseEntity<>(directivos, HttpStatus.OK);
    }

    @GetMapping({ "directivos/{id}" })
    public ResponseEntity<?> directivoPorId(@PathVariable Long id) {
        return new ResponseEntity<>(directivoService.buscarDirectivoPorId(id), HttpStatus.OK);
    }


    @PostMapping("/directivos")
    public ResponseEntity<?> guardarUsuario(@RequestBody Directivo directivo) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(directivoService.guardarDirectivo(directivo));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping({ "directivos/{id}" })
    public ResponseEntity<?> actualizarEmpresa(@PathVariable Long id, @RequestBody Directivo directivo) {
        directivoService.actualizarDirectivo(id, directivo);
        return new ResponseEntity<>(directivoService.buscarDirectivoPorId(id), HttpStatus.OK);
    }

    @DeleteMapping({ "directivos/{id}" })
    public ResponseEntity<?> borrarDirectivoPorId(@PathVariable("id") Long id) {
        directivoService.eliminarDirectivoPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    
}
