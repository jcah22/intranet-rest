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

import com.intranet.intranet.models.Proveedor;
import com.intranet.intranet.service.IProveedorService;

@RestController
@RequestMapping("/api")
public class RestProveedorController {

    @Autowired
    private IProveedorService proveedorService;

    @GetMapping("/proveedores")
    public ResponseEntity<List<Proveedor>> ReqsTodas() {
        List<Proveedor> proveedores = proveedorService.listarTodosLosProveedores();
        return new ResponseEntity<>(proveedores, HttpStatus.OK);
    }

    @GetMapping("proveedores/{id}")
    public ResponseEntity<?> proveedorPorId(@PathVariable Long id) {
        return new ResponseEntity<>(proveedorService.buscarProveedorPorId(id), HttpStatus.OK);
    }

    @PostMapping("/proveedores")
    public ResponseEntity<?> guardarProveedor(@RequestBody Proveedor prov) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(proveedorService.guardarProveedor(prov));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping({ "proveedores/{id}" })
    public ResponseEntity<?> actualizarProveedor(@PathVariable Long id, @RequestBody Proveedor prov) {
        proveedorService.actualizarProveedor(id, prov);
        return new ResponseEntity<>(proveedorService.buscarProveedorPorId(id) ,HttpStatus.OK);
    }


    @DeleteMapping({ "proveedores/{id}" })
    public ResponseEntity<?> borrarProveedorPorId(@PathVariable("id") Long id) {
        proveedorService.eliminarProveedorPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
