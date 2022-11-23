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

import com.intranet.intranet.models.Empresa;
import com.intranet.intranet.service.IEmpresaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api")
public class RestEmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping("/empresas")
    public ResponseEntity<List<Empresa>> todasLasEmpresas() {
        List<Empresa> empresas = empresaService.listarTodasLasEmpresas();
        return new ResponseEntity<>(empresas, HttpStatus.OK);
    }

    @GetMapping({ "empresas/{id}" })
    public ResponseEntity<?> empresaPorId(@PathVariable Long id) {
        return new ResponseEntity<>(empresaService.buscarEmpresaPorId(id), HttpStatus.OK);
    }

    @PostMapping("/empresas")
    public ResponseEntity<?> guardarEmpresa(@RequestBody Empresa empresa) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(empresaService.guardarEmpresa(empresa));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping({ "empresas/{id}" })
    public ResponseEntity<?> borrarEmpresaPorId(@PathVariable("id") Long id) {
        empresaService.eliminarEmpresaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    

    @PutMapping({ "empresas/{id}" })
    public ResponseEntity<?> actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa empresa) {
        empresaService.actualizarArea(id, empresa);
        return new ResponseEntity<>(empresaService.buscarEmpresaPorId(id), HttpStatus.OK);
    }


    

}
