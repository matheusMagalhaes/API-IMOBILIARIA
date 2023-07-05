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
@Table(name = "LOCACAO")
public class Locacao {

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

	@Column(name = "DATA_INICIO_ALUGUEL")
	private Date dataInicioAluguel;

	@Column(name = "DATA_FIM_ALUGUEL") 
	private Date dataFimAlugel;

	@Column(name = "DIA_VENC_ALUGUEL")
	private Integer diaVencAluguel;

	@Column(name = "PERC_MULT")
	private Double percMult;

	@Column(name = "VALOR_ALUGUEL")
	private BigDecimal valorAluguel;

	@Column(name = "OBSERVACAO")
	private String observacao;
}
