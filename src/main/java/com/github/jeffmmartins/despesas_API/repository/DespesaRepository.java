package com.github.jeffmmartins.despesas_API.repository;

import com.github.jeffmmartins.despesas_API.entities.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {


}
