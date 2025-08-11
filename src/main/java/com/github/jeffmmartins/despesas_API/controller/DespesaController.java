package com.github.jeffmmartins.despesas_API.controller;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import com.github.jeffmmartins.despesas_API.service.ServiceDespesa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DespesaController {

    private ServiceDespesa serviceDespesa;

    public DespesaController(ServiceDespesa serviceDespesa) {
        this.serviceDespesa = serviceDespesa;
    }

    @PostMapping
    public Despesa cadastrarDespesa(@RequestBody Despesa despesa){
        Despesa despesaSalva = serviceDespesa.cadastrarDespesa(despesa);
        return despesaSalva;
    }
}
