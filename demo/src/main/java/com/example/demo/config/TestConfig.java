package com.example.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.actuate.autoconfigure.metrics.export.dynatrace.DynatraceProperties.V1;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.demo.Entities.Endereco;
import com.example.demo.Entities.Pagamento;
import com.example.demo.Entities.Produto;
import com.example.demo.Entities.User;
import com.example.demo.Entities.Venda;
import com.example.demo.Repository.EnderecoRepository;
import com.example.demo.Repository.PagamentoRepository;
import com.example.demo.Repository.ProdutoRepository;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Repository.VendaRepository;
import com.example.demo.enums.EstadoDeCompra;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository repository;

    @Autowired
    private EnderecoRepository repository2;

    @Autowired
    private VendaRepository vRepository;

    @Autowired
    private ProdutoRepository produtoRepository;


    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Override
    public void run(String... args) throws Exception {


        User u1 = new User(null,"Rafael", "11122233344", "teste@gmail.com");
        User u2 = new User(null,"Rafael", "11122233344", "teste@gmail.com");
        
        repository.saveAll(Arrays.asList(u1,u2));

        Endereco end1 = new Endereco(null, "Teste", "Teste", "Teste" ,u1);
        Endereco end2 = new Endereco(null, "Teste", "Teste", "Teste",u2);

        repository2.saveAll(Arrays.asList(end1, end2));

        Venda venda1 = new Venda(null, Instant.parse("2023-06-20T19:53:07Z"),u1,EstadoDeCompra.PAGO);
        Venda venda2 = new Venda(null, Instant.parse("2022-06-20T19:53:07Z"),u1,EstadoDeCompra.PAGO);
        Venda venda3 = new Venda(null, Instant.parse("2022-06-20T19:53:07Z"),u2,EstadoDeCompra.ESPERANDO_PAGAMENTO);
        vRepository.saveAll(Arrays.asList(venda1,venda2));

        Produto produto1 = new Produto(null, "Livro", 12.21, 200);
        Produto produto2 = new Produto(null, "carro", 12.21, 200);

        produtoRepository.saveAll(Arrays.asList(produto1, produto2));


        Pagamento pag = new Pagamento(null,Instant.parse("2023-06-20T19:53:07Z"), venda3);
        venda3.setPagamento(pag);
        vRepository.save(venda3);
        // pagamentoRepository.saveAll(Arrays.asList(pag));
    }  
}
