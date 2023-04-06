package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.VendaRepository;
import com.example.demo.Entities.Venda;


@Service
public class VendaService {
    @Autowired
    private VendaRepository repository;

    public List<Venda> findAll(){
        return repository.findAll();
    }
}
