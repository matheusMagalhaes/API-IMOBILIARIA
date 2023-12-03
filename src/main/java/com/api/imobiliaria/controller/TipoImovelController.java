package com.api.imobiliaria.controller;

import com.api.imobiliaria.handlers.ResponseHandler;
import com.api.imobiliaria.model.TipoImovel;
import com.api.imobiliaria.service.TipoImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/imovel")
public class TipoImovelController {

    @Autowired
    private TipoImovelService service;

    @GetMapping("/tipo")
    ResponseEntity<Object> findAll(){
        try {
            List<TipoImovel> listaTipo = this.service.findall();
            return ResponseHandler.responseHandler("OK", HttpStatus.OK, listaTipo);
        }catch (Exception e){
            return ResponseHandler.responseHandler("error", HttpStatus.BAD_REQUEST,e.getMessage());
        }
    }
}
