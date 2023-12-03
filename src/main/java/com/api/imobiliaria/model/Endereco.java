package com.api.imobiliaria.model;

import jakarta.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "ENDERECO")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "RUA")
    @NotNull(message =  "Rua nao pode ser nulo")
    @NotBlank(message = "rua nao pode ser vazio")
    private String rua;

    @Column(name = "NUMERO")
    @NotNull(message = "Numero nao pode ser nulo")
    @NotBlank(message = "Numero nao pode ser vazio")
    private Integer numero;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @Column(name = "BAIRRO")
    @NotNull(message =  "Bairro nao pode ser nulo")
    @NotBlank(message = "Bairro nao pode ser vazio")
    private String bairro;

    @Column(name = "CIDADE")
    @NotNull(message = "Cidade nao pode ser nulo")
    @NotBlank(message = "Cidade nao pode ser vazio")
    private String ciadade;

    @Column(name = "UF")
    @NotNull(message = "uf nao pode ser nulo")
    @NotBlank(message = "uf nao pode ser vazio")
    private String uf;

    @Column(name  = "CEP")
    @NotNull(message = "Cep nao pode ser nulo")
    @NotBlank(message = "Cep nao pode ser vazio")
    private String cep;

}
