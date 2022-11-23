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

import com.intranet.intranet.models.Odc;
import com.intranet.intranet.service.IOdcService;

@RestController
@RequestMapping("/api")
public class RestOdcController {

    @Autowired
    private IOdcService odcService;

    @GetMapping("/odcs")
    public ResponseEntity<List<Odc>> usuariosTodos() {
        List<Odc> odcs = odcService.listarTodosLasOdcs();
        return new ResponseEntity<>(odcs, HttpStatus.OK);
    }

    @GetMapping({ "odcs/{id}" })
    public ResponseEntity<?> odcPorId(@PathVariable Long id) {
        return new ResponseEntity<>(odcService.buscarOdcPorId(id), HttpStatus.OK);
    }

    @PostMapping("/odcs")
    public ResponseEntity<?> guardarOdc(@RequestBody Odc odc) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(odcService.guardarOdc(odc));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping({ "odcs/{id}" })
    public ResponseEntity<?> actualizarOdc(@PathVariable Long id, @RequestBody Odc odc) {
        odcService.actualizarArea(id, odc);
        return new ResponseEntity<>(odcService.buscarOdcPorId(id), HttpStatus.OK);
    }

    @DeleteMapping({ "odcs/{id}" })
    public ResponseEntity<?> borrarOdcPorId(@PathVariable("id") Long id) {
        odcService.eliminarOdcPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
