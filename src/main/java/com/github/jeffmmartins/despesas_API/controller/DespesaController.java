package com.github.jeffmmartins.despesas_API.controller;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import com.github.jeffmmartins.despesas_API.service.ServiceDespesa;
import io.swagger.v3.oas.annotations.Operation;
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

    @Operation(summary = "Cadastrar", description = "Metódo para cadastrar uma despesa")
    @PostMapping
    public ResponseEntity<Despesa> cadastrarDespesa(@RequestBody Despesa despesa){
        return ResponseEntity.status(HttpStatus.CREATED).body(serviceDespesa.cadastrarDespesa(despesa));
    }

    @Operation(summary = "Pesquisar", description = "Metódo para pesquisar uma despesa")
    @GetMapping("/{id}")
    public ResponseEntity<Despesa> buscarPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(serviceDespesa.buscarPorId(id));
    }

    @Operation(summary = "Atualizar", description = "Metódo para atualizar uma despesa")
    @PutMapping("/{id}")
    public ResponseEntity<Despesa> atualizarDespesa(@PathVariable("id") Long id, @RequestBody Despesa despesaAtualizada){
        return ResponseEntity.ok(serviceDespesa.atualizarDespesa(id,despesaAtualizada));
    }

    @Operation(summary = "Deletar", description = "Metódo para deletar uma despesa")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarDespesaPorId(@PathVariable("id") Long id){
        serviceDespesa.deleteDespesa(id);
        return ResponseEntity.noContent().build();
    }
}
