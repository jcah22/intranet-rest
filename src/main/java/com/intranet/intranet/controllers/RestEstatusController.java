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

import com.intranet.intranet.models.Estatus;
import com.intranet.intranet.service.IEstatusService;

@RestController
@RequestMapping("/api")
public class RestEstatusController {

    @Autowired
    private IEstatusService estatusService;

    @GetMapping("/estatus")
    public ResponseEntity<List<Estatus>> todasLasEmpresas() {
        List<Estatus> estatus = estatusService.listarTodosLosEstatus();
        return new ResponseEntity<>(estatus, HttpStatus.OK);
    }

    @GetMapping({ "estatus/{id}" })
    public ResponseEntity<?> estatusPorId(@PathVariable Long id) {
        return new ResponseEntity<>(estatusService.buscarEstatusPorId(id), HttpStatus.OK);
    }

    @PostMapping("/estatus")
    public ResponseEntity<?> guardarEstatus(@RequestBody Estatus estatus) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(estatusService.guardarEstatus(estatus));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }

    }

    @PutMapping({ "estatus/{id}" })
    public ResponseEntity<?> actualizarEstatus(@PathVariable Long id, @RequestBody Estatus estatus) {
        estatusService.actualizarEstatus(id, estatus);
        return new ResponseEntity<>(estatusService.buscarEstatusPorId(id), HttpStatus.OK);
    }

    @DeleteMapping({ "estatus/{id}" })
    public ResponseEntity<?> borrarEstatusPorId(@PathVariable("id") Long id) {
        estatusService.eliminarEstatusPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
