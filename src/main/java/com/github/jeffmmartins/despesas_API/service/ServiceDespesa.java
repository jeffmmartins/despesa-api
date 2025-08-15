package com.github.jeffmmartins.despesas_API.service;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import com.github.jeffmmartins.despesas_API.repository.DespesaRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class ServiceDespesa {

    private final DespesaRepository despesaRepository;

    public ServiceDespesa(DespesaRepository despesaRepository) {
        this.despesaRepository = despesaRepository;
    }

    //Metódo para cadastrar despesa.
    public Despesa cadastrarDespesa(Despesa despesa){
        // Valida se o objeto despesa é nulo.
        if (despesa == null){
            throw new IllegalArgumentException("O objeto despesa não pode ser nulo.");
        }
        if (despesa.getDescricao() == null || despesa.getDescricao().isBlank()) {
            throw new IllegalArgumentException("A descrição da despesa é obrigatória.");
        }
        if (despesa.getValor() == null || despesa.getValor().compareTo(java.math.BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor da despesa deve ser positivo e não pode ser nulo.");
        }
        if (despesa.getData() == null) {
            throw new IllegalArgumentException("A data da despesa é obrigatória.");
        }
        return despesaRepository.save(despesa);
    }

    //Metódo para buscar a despesa pelo id.
    public Despesa buscarPorId(Long id){
        return despesaRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Despesa não encontrada com ID: " + id));
    }

    //Metódo que permite atualizar a despesa.

    public Despesa atualizarDespesa(Long id, Despesa despesaAtualizada ) {
        Despesa despesaExistente = despesaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Despesa não encontrada com ID: " + id));

        despesaExistente.setDescricao(despesaAtualizada.getDescricao());
        despesaExistente.setValor(despesaAtualizada.getValor());
        despesaExistente.setData(despesaAtualizada.getData());
        return despesaRepository.save(despesaExistente);
    }

    //Metódo para deletar um despesa.
    public void deleteDespesa(Long id){
        despesaRepository.deleteById(id);
    }
}
