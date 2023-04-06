package com.example.demo.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Service.VendaService;


import com.example.demo.Entities.Venda;


@RestController
@RequestMapping(value = "/vendas")
public class VendaResources {
    
    @Autowired
    private VendaService service;

    @GetMapping
    public ResponseEntity<List<Venda>> findAll(){
        List<Venda> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
