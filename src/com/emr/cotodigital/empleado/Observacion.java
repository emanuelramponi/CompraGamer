package com.emr.cotodigital.empleado;

public class Observacion {

    private String motivo;
    private String explicacion;
    private String medidaAplicada;

    public Observacion() { }

    public Observacion(String motivo, String explicacion, String sancion){
        this.motivo = motivo;
        this.explicacion = explicacion;
        this.medidaAplicada = sancion;
    }

    public String getMotivo(){ return this.motivo; }
    public String getExplicacion(){ return  this.explicacion; }
    public String getMedidaAplicada(){ return  this.medidaAplicada; }

    public void setMotivo(String motivo) {this.motivo = motivo;}
    public void setExplicacion(String explicacion) { this.explicacion = explicacion;}
    public void setMedidaAplicada(String medidaAplicada) {this.medidaAplicada = medidaAplicada;}


}
