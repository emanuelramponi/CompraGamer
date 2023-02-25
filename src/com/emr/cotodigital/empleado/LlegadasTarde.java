package com.emr.cotodigital.empleado;

import java.util.Date;

public class LlegadasTarde {

    private String horarioEntrada;
    private Date dia;
    private String horarioEntradaReal;
    private int cantidadMinutosTarde;

    public LlegadasTarde(){ }

    public LlegadasTarde(String horarioEntrada){
        this.horarioEntrada = horarioEntrada;}

    public LlegadasTarde(String horarioEntrada, Date dia){
        this(horarioEntrada);
        this.dia = dia;
    }

    public LlegadasTarde(String horarioEntrada, Date dia, String horarioEntradaReal){
        this(horarioEntrada, dia);
        this.horarioEntradaReal= horarioEntradaReal;
    }


    public String getHorarioEntrada(){ return this.horarioEntrada;}
    public String getHorarioEntradaReal() {return this.horarioEntradaReal;}
    public Date getDia(){ return this.dia;}
    public int getCantidadMinutosTarde(){ return this.cantidadMinutosTarde;}


    public void setDia(Date dia) { this.dia = dia;}
    public void setHorarioEntrada(String horarioEntrada) { this.horarioEntrada = horarioEntrada;}
    public void setHorarioEntradaReal(String horarioEntradaReal) { this.horarioEntradaReal = horarioEntradaReal;}
    public void setCantidadMinutosTarde(int cantidadMinutosTarde) { this.cantidadMinutosTarde = cantidadMinutosTarde;}


    public

}
