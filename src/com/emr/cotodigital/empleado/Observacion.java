package com.emr.cotodigital.empleado;

public class Observacion {

    private final String motivo;
    private String explicacion;
    private String sancion;

    public Observacion(String motivo) { this.motivo = motivo; }

    public Observacion (String motivo, String explicacion) {
        this(motivo);
        this.explicacion = explicacion;
    }

    public Observacion(String motivo, String explicacion, String sancion){
        this(motivo, explicacion);
        this.sancion = sancion;
    }

    public String getMotivo(){ return this.motivo; }
    public String getExplicacion(){ return  this.explicacion; }
    public String getSancion(){ return  this.sancion; }




}
