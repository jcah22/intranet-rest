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

import com.intranet.intranet.models.Cfdi;
import com.intranet.intranet.service.ICfdiService;

@RestController
@RequestMapping("/api")
public class RestCfdiController {

    @Autowired
    private ICfdiService cfdiService;

    @GetMapping("/cfdis")
    public ResponseEntity<List<Cfdi>> todosCfdis() {
        List<Cfdi> cfdis = cfdiService.listarTodosLosCfdis();
        return new ResponseEntity<>(cfdis, HttpStatus.OK);
    }

    @GetMapping({ "cfdis/{id}" })
    public ResponseEntity<?> cfdiPorId(@PathVariable Long id) {
        return new ResponseEntity<>(cfdiService.buscarCfdiPorId(id), HttpStatus.OK);
    }

    @PostMapping("/cfdi")
    public ResponseEntity<?> guardarCfdi(@RequestBody Cfdi cfdi) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(cfdiService.guardarCfdi(cfdi));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping({ "cfdis/{id}" })
    public ResponseEntity<?> actualizarCfdi(@PathVariable Long id, @RequestBody Cfdi cfdi) {
        cfdiService.actualizarCfdi(id, cfdi);
        return new ResponseEntity<>(cfdiService.buscarCfdiPorId(id), HttpStatus.OK);
    }

    @DeleteMapping({ "cfdis/{id}" })
    public ResponseEntity<?> borrarCfdiPorId(@PathVariable("id") Long id) {
        cfdiService.eliminarCfdiPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
