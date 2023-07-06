package com.api.imobiliaria.serviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.imobiliaria.model.Imovel;
import com.api.imobiliaria.model.dto.ImovelDto;
import com.api.imobiliaria.repository.ImovelRepository;
import com.api.imobiliaria.service.ImovelService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ImovelServiceImpl implements ImovelService {

	@Autowired
	private ImovelRepository imovelRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<Imovel> buscarImoveis() {
		return this.imovelRepository.findAll();

	}

	@Override
	public Imovel salvarImovel(ImovelDto imovelDto) {
		Imovel imovel = this.modelMapper.map(imovelDto, Imovel.class);
		return this.imovelRepository.save(imovel);
	}

}
