package com.api.imobiliaria.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.imobiliaria.model.Imovel;
import com.api.imobiliaria.repository.ImovelRepository;
import com.api.imobiliaria.service.ImovelService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ImovelServiceImpl implements ImovelService {

	@Autowired
	private ImovelRepository imovelRepository;

	@Override
	public List<Imovel> buscarImoveis() {
		return this.imovelRepository.findAll();
	}

}
