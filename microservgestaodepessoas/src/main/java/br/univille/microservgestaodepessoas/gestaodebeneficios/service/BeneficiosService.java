package br.univille.microservgestaodepessoas.gestaodebeneficios.service;

import java.util.List;
import br.univille.microservgestaodepessoas.gestaodebeneficios.entity.Beneficios;

public interface BeneficiosService {
    List<Beneficios> getAll();
    Beneficios save(Beneficios beneficios);
}