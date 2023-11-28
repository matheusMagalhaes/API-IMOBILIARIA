package com.api.imobiliaria.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "IMOVEL_VENDA")
public class ImovelVenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "IS_RESIDENTIAL")
    @NotNull(message = "IsResidential must not be null")
    private boolean isResidential;

    @JoinColumn(name = "TIPO_IMV", referencedColumnName = "ID")
    @ManyToOne
    private TipoImovel tipoImv;

    @Column(name = "AREA_UTIL")
    @NotNull(message = "areaUtil must not be null")
    @NotBlank(message  = "areaUtil must not be blank")
    private Double areaUtil;

    @Column(name = "AREA_TOTAL")
    @NotNull(message = "areaTotal must not be null")
    @NotBlank(message  = "areaTotal must not be blank")
    private Double areaTotal;

    @Column(name = "QUARTOS")
    @NotNull(message = "quartos must not be null")
    @NotBlank(message = "quartos must not be blank")
    private Integer quartos;

    @Column(name = "BANHEIROS")
    @NotNull(message = "banheiros must not be null")
    @NotBlank(message = "quartos must not be blank")
    private Integer banheiros;

    @Column(name = "SUITES")
    private Integer suites;

    @Column(name = "GARAGENS")
    private Integer garagens;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "VALOR_IMV")
    @NotNull(message = "valorImv must not be null")
    @NotBlank(message = "valorImv must not be blank")
    private BigDecimal valorImv;

    @Column(name = "CONDOMINIO")
    private BigDecimal condominio;

    @Column(name = "IPTU")
    private BigDecimal iptu;

}
