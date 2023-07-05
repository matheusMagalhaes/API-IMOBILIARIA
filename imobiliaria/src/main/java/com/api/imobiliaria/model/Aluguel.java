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
@Table(name = "ALUGUEL")
public class Aluguel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "DATA_VENC")
	private Date dataVenc;

	@Column(name = "VALOR_PAGO")
	private BigDecimal bigDecimal;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "LOCACAO_ID", referencedColumnName = "ID")
	private Locacao locacao;

	@Column(name = "OBSERVACAO")
	private String observacao;

}
