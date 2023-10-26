package com.api.imobiliaria.repository;

import com.api.imobiliaria.model.TipoImovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoImovelRepository extends JpaRepository<TipoImovel, Integer> {
}