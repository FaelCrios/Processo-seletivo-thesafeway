package com.example.demo.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ProdutoService;

import com.example.demo.Entities.Produto;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResources {
    

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){        
        List<Produto> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
