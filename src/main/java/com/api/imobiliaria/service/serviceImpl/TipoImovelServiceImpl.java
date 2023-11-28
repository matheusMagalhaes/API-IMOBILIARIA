package com.api.imobiliaria.service.serviceImpl;

import com.api.imobiliaria.model.TipoImovel;
import com.api.imobiliaria.repository.TipoImovelRepository;
import com.api.imobiliaria.service.TipoImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoImovelServiceImpl implements TipoImovelService {


    @Autowired
    private TipoImovelRepository repository;

    @Override
    public List<TipoImovel> findall() {
        return this.repository.findAll();
    }
}
