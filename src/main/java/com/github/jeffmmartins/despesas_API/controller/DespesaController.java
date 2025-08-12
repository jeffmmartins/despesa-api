package com.github.jeffmmartins.despesas_API.controller;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import com.github.jeffmmartins.despesas_API.service.ServiceDespesa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    private final ServiceDespesa serviceDespesa;

    public DespesaController(ServiceDespesa serviceDespesa) {
        this.serviceDespesa = serviceDespesa;
    }

    @PostMapping
    public ResponseEntity<Despesa> cadastrarDespesa(@RequestBody Despesa despesa){
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceDespesa.cadastrarDespesa(despesa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Despesa> buscarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(serviceDespesa.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Despesa> atualizarDespesa(@PathVariable("id") Long id, @RequestBody Despesa despesaAtualizada){
        return ResponseEntity.ok(serviceDespesa.atualizarDespesa(id,despesaAtualizada));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDespesaPorId(@PathVariable("id") Long id){
        serviceDespesa.deleteDespesa(id);
        return ResponseEntity.noContent().build();
    }
}
