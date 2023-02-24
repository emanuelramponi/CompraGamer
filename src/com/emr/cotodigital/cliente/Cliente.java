package com.emr.cotodigital.cliente;

import com.emr.cotodigital.Persona;

public class Cliente extends Persona{

    private final int id_cliente;
    private String email;
    private Domicilio domicilio;
    private Facturas[] facturas;
    private Pedido[] pedidos;
    private int gamerCoins;

    private static int ultimoId;

    public Cliente(){
        this.id_cliente = ++ultimoId;
    }


    public Cliente(String email){
        this();
        this.email = email;
    }

    public Cliente(String email, Domicilio domicilio) {
        this(email);
        this.domicilio = domicilio;
    }


    public void setDomicilio(Domicilio domicilio){
        this.domicilio = domicilio;
    }

}
