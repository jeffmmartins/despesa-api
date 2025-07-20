package com.github.jeffmmartins.despesas_API.service;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import com.github.jeffmmartins.despesas_API.repository.DespesaRepository;
import org.springframework.stereotype.Service;

@Service
public class ServiceDespesa {

    private final DespesaRepository despesaRepository;

    public ServiceDespesa(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    //Metódo para cadastrar a despesa.
    public void saveDespesa(Despesa despesa){
        //Realizando a verificação se o objeto está vazio.
        if (despesa == null){
            throw new IllegalArgumentException("Por gentileza inserir as informações");
        }
        despesaRepository.save(despesa);
    }

    //Metódo para buscar a despesa pelo od.
    public Despesa buscarPorId(Despesa despesa){
        despesaRepository.findById(despesa.getId());
    }


}
