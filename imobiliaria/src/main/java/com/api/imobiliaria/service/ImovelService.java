package com.api.imobiliaria.service;

import java.util.List;

import com.api.imobiliaria.model.Imovel;
import com.api.imobiliaria.model.dto.ImovelDto;

public interface ImovelService {

	List<Imovel> buscarImoveis();

	Imovel salvarImovel(ImovelDto imovel);
}
