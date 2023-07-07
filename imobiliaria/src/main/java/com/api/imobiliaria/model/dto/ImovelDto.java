package com.api.imobiliaria.model.dto;

import com.api.imobiliaria.model.Endereco;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ImovelDto {

	private Integer id;

	private String tipoImovel;

	private String descricao;

	private Endereco endereco;

	private Integer qtdDormitorio;

	private Integer qtdBanheiro;

	private Integer qtdSuites;

	private Integer metrosQuadrados;

	private Integer valorAluguel;

	private String observacao;

	private Boolean isVenda;
}
