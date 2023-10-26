package com.api.imobiliaria.controller;

import com.api.imobiliaria.model.TipoImovel;
import com.api.imobiliaria.service.TipoImovelService;
import org.springframework.beans.factory.annotation.Autowired;
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
    List<TipoImovel> findAll(){
        return this.service.findall();
    }
}
