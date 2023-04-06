package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
    
}
