package com.api.imobiliaria.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.imobiliaria.model.Imovel;
import com.api.imobiliaria.model.dto.ImovelDto;
import com.api.imobiliaria.service.ImovelService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/imovel/")
@AllArgsConstructor
public class ImovelController {

	private ImovelService imovelSevice;

	@GetMapping("buscar")
	public List<Imovel> buscarImoveis() {
		return this.imovelSevice.buscarImoveis();
	}

	@PostMapping("salvar-imovel")
	public Imovel salvarImovel(@RequestBody ImovelDto imovelDto) {
		return this.imovelSevice.salvarImovel(imovelDto);
	}

}
