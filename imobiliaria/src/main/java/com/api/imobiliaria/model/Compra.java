package com.api.imobiliaria.model;

import java.math.BigDecimal;
import java.sql.Date;

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
@Table(name = "COMPRA")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "IMOVEL_ID", referencedColumnName = "ID")
	private Imovel imovel;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "CLIENTE_ID", referencedColumnName = "ID")
	private Cliente cliente;

	@Column(name = "ATIVO")
	private Boolean ativo;

	@Column(name = "DATA_VENDA")
	private Date dataVenda;

	@Column(name = "VALOR_IMOVEL")
	private BigDecimal valorImovel;

	@Column(name = "OBSERVACAO")
	private String observacao;
}
