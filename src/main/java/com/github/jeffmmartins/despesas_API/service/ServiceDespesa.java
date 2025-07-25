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
    public void cadastrarDespesa(Despesa despesa){
        //Realizando a validação se o objeto está vazio.
        if (despesa == null){
            throw new IllegalArgumentException("Por gentileza inserir as informações");
        }
        despesaRepository.save(despesa);
    }

    //Metódo para buscar a despesa pelo id.
    public Despesa buscarPorId(Long id){
        return despesaRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Despesa não encontrada com ID: " + id));
    }

    //Metódo que permite atualizar a despesa.
    public void atualizarDespesa(Despesa despesa){
        despesaRepository.save(despesa);
    }

    //Metódo para deletar um despesa.
    public void deleteDespesa(Long id){
        despesaRepository.deleteById(id);
    }
}
