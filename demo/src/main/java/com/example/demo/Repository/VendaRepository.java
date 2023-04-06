package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long>{
    
}
