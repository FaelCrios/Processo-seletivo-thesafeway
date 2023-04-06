package com.example.demo.Entities;

import java.time.Instant;

import com.example.demo.enums.EstadoDeCompra;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_vendas")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant data;
    private EstadoDeCompra estadoCompra;


    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;

    @OneToOne(mappedBy = "venda", cascade = CascadeType.ALL)
    private Pagamento pagamento;


    public Venda() {
    }


    public Venda(Long id, Instant data, User usuario, EstadoDeCompra estadoCompra) {
        this.id = id;
        this.data = data;
        this.usuario = usuario;
        setEstadoCompra(estadoCompra);
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Instant getData() {
        return data;
    }


    public void setData(Instant data) {
        this.data = data;
    }


    public User getUsuario() {
        return usuario;
    }


    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }


    public EstadoDeCompra getEstadoCompra() {
        return estadoCompra;
    }


    public void setEstadoCompra(EstadoDeCompra estadoCompra) {
        this.estadoCompra = estadoCompra;
    }


    public Pagamento getPagamento() {
        return pagamento;
    }


    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    

}
