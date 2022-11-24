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

import com.intranet.intranet.models.Req;
import com.intranet.intranet.service.IReqService;

@RestController
@RequestMapping("/api")
public class RestReqController {

    @Autowired
    private IReqService reqService;

    @GetMapping("/reqs")
    public ResponseEntity<List<Req>> ReqsTodas() {
        List<Req> reqs = reqService.listarTodasLasReqs();
        return new ResponseEntity<>(reqs, HttpStatus.OK);
    }

    @GetMapping({ "reqs/{id}" })
    public ResponseEntity<?> reqPorId(@PathVariable Long id) {
        return new ResponseEntity<>(reqService.buscarReqPorId(id), HttpStatus.OK);
    }

    
    @PostMapping("/reqs")
    public ResponseEntity<?> guardarReq(@RequestBody Req req) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(reqService.guardarReq(req));

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"Error\":\"Error. Por favor intente mas tarde.\"}");
        }
    }

    @PutMapping({ "reqs/{id}" })
    public ResponseEntity<?> actualizarReq(@PathVariable Long id, @RequestBody Req req) {
        reqService.actualizarReq(id, req);
        return new ResponseEntity<>(reqService.buscarReqPorId(id), HttpStatus.OK);
    }


    @DeleteMapping({ "reqs/{id}" })
    public ResponseEntity<?> borrarReqPorId(@PathVariable("id") Long id) {
        reqService.eliminarReqPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    
}
