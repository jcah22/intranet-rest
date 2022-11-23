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
import com.intranet.intranet.models.Area;
import com.intranet.intranet.service.IAreaService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api")
public class RestAreaController {

    @Autowired
    private IAreaService areaService;

    @GetMapping("/areas")
    public ResponseEntity<List<Area>> usuariosTodos() {
        List<Area> areas = areaService.listarTodasLasAreas();

        return new ResponseEntity<>(areas, HttpStatus.OK);

    }

    @GetMapping({ "areas/{id}" })
    public ResponseEntity<?> areaPorId(@PathVariable Long id) {
        return new ResponseEntity<>(areaService.buscarAreaPorId(id), HttpStatus.OK);
    }

    @PostMapping("/areas")
    public ResponseEntity<?> save(@RequestBody Area area) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(areaService.guardarArea(area));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping({ "areas/{id}" })
    public ResponseEntity<?> borrarArea(@PathVariable("id") Long id) {
        areaService.eliminarAreaPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping({ "areas/{id}" })
    public ResponseEntity<?> actualizarArea(@PathVariable Long id, @RequestBody Area area) {
        areaService.actualizarArea(id, area);
        return new ResponseEntity<>(areaService.buscarAreaPorId(id), HttpStatus.OK);
    }

}
