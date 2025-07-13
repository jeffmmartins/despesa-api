package com.github.jeffmmartins.despesas_API.repository;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesaRepository extends JpaRepository<Despesa, Id> {
}
