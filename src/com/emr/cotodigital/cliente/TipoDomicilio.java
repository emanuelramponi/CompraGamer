package com.emr.cotodigital.cliente;

public enum TipoDomicilio {
    CASA("CASA"),
    DEPARTAMENTO("DEPARTAMENTO"),
    PH("PH");

    private final String tipoDomicilio;

    TipoDomicilio (String tipoDomicilio){
        this.tipoDomicilio = tipoDomicilio;
    }

    public String getTipoDomicilio(){ return tipoDomicilio; }

    @Override
    public String toString(){ return this.tipoDomicilio; }
}
