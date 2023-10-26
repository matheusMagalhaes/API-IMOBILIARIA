package com.api.imobiliaria.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class TipoImovel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TIPO")
    private String tipo;

}
