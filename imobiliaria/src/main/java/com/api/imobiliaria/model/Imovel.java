package com.api.imobiliaria.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "IMOVEL")
public class Imovel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "TIPO_IMOVEL")
	private String tipoImovel;

	@Column(name = "DESCRICAO")
	private String descricao;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "ENDERECO_ID", referencedColumnName = "ID")
	private Endereco endereco;

	@Column(name = "QTD_DORMITORIO")
	private Integer qtdDormitorio;

	@Column(name = "QTD_BANHEIRO")
	private Integer qtdBanheiro;

	@Column(name = "QTD_SUITES")
	private Integer qtdSuites;

	@Column(name = "METROS_QUADRADOS")
	private Integer metrosQuadrados;

	@Column(name = "VALOR_ALUGUEL")
	private Integer valorAluguel;

	@Column(name = "OBSERVACAO")
	private String observacao;
}
