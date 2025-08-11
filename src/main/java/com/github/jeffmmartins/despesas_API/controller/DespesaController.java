package com.github.jeffmmartins.despesas_API.controller;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import com.github.jeffmmartins.despesas_API.service.ServiceDespesa;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private ServiceDespesa serviceDespesa;

    public DespesaController(ServiceDespesa serviceDespesa) {
        this.serviceDespesa = serviceDespesa;
    }

    @PostMapping
    public ResponseEntity<Despesa> cadastrarDespesa(@RequestBody Despesa despesa){
        Despesa despesaSalva = serviceDespesa.cadastrarDespesa(despesa);

        return ResponseEntity.status(HttpStatus.CREATED).body(despesaSalva);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Despesa> buscarPorId(@PathVariable("id") Long id){
        Despesa despesaEncontrada = serviceDespesa.buscarPorId(id);

        return ResponseEntity.ok(despesaEncontrada);
    }

}
