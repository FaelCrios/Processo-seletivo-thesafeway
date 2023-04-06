package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Produto;
import com.example.demo.Repository.ProdutoRepository;

@Service
public class ProdutoService {
    

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> findAll(){
        return  repository.findAll();
    }
}
