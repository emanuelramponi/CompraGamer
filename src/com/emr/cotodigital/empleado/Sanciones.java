package com.emr.cotodigital.empleado;

public class Sanciones {


    private String motivo;
    private String descripcion;
    private String descargoEmpleado;
    private String medidaAplicada;

    public Sanciones(String motivo) { this.motivo = motivo; }

    public Sanciones (String motivo, String descripcion) {
        this(motivo);
        this.descripcion = descripcion;
    }

    public Sanciones(String motivo, String explicacion, String descargoEmpleado){
        this(motivo, explicacion);
        this.descripcion = descargoEmpleado;
    }

    public Sanciones(String motivo, String explicacion, String descargoEmpleado, String medidaAplicada){
        this(motivo, explicacion, descargoEmpleado);
        this.medidaAplicada = medidaAplicada;
    }


    public String getMotivo(){ return this.motivo; }
    public String getDescripcion(){ return  this.descripcion; }
    public String getMedidaAplicada() { return this.medidaAplicada;}
    public String getDescargoEmpleado(){ return this.descargoEmpleado;}

    public void setMotivo(String motivo) { this.motivo = motivo;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
    public void setDescargoEmpleado(String descargoEmpleado){this.descargoEmpleado = descargoEmpleado;}
    public void setMedidaAplicada(String medidaAplicada) {this.medidaAplicada = medidaAplicada;}


    public String getSanciones(){
        return "Motivo: " + getMotivo() +
                "\nDescripcion del hecho: " + getDescripcion() +
                "\nDescargo del empleado: " + getDescargoEmpleado() +
                "\nMedida aplicada: " + getMedidaAplicada();
    }

}
