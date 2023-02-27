package com.emr.cotodigital.empleado;

import com.emr.cotodigital.Persona;

import java.util.Date;

public class Empleado extends Persona {
    private int legajo;

    private Date fechaIngreso;

    private SectorTrabajo sector;

    private FichaRosa fichaRosa;

    private int ultimolegajo;

    public Empleado() {

        this.legajo = ++ultimolegajo;}


    public Empleado(Date fechaIngreso)
    {
        this();
        this.fechaIngreso = fechaIngreso;
    }

    public Empleado(Date fechaIngreso, SectorTrabajo sector)
    {
        this(fechaIngreso);
        this.sector = sector;
    }


    public int getLegajo(){ return this.legajo;}

    public Date getFechaIngreso(){return this.fechaIngreso;}

    public SectorTrabajo getSector() {return this.sector;}


    public void setLegajo(int legajo) { this.legajo = legajo;}

    public void setFechaIngreso (Date fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public void setSector(SectorTrabajo sector)  {this.sector = sector;}

}
