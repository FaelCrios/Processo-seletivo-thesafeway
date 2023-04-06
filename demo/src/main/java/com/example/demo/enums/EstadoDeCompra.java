package com.example.demo.enums;

public enum EstadoDeCompra {
    PAGO(0),
    ESPERANDO_PAGAMENTO(1),
    CANCELADO(2);

    private int code;

    private EstadoDeCompra(int code){
        this.code = code;
    }

    public int getCode(){
        return code;
    }

    public static EstadoDeCompra valor(int code){
        for(EstadoDeCompra valor: EstadoDeCompra.values()){
            if(valor.getCode() == code ){
                return valor;
            }
        }
        throw new IllegalArgumentException("Error");
    }
}
