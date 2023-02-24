package com.emr.cotodigital.empleado;

public class FichaRosa {

    private LlegadasTarde[] llegadasTarde;

    private Sanciones[] sanciones;

    private Observacion[] observacion;

    private int indiceObservaciones;

    FichaRosa(){
        this.llegadasTarde = new LlegadasTarde[5];
        this.sanciones = new Sanciones[3];
        this.observacion = new Observacion[7];
    }


    public LlegadasTarde[] getLlegadasTarde(){ return this.llegadasTarde;}
    public Sanciones[] getSanciones() { return this.sanciones;} //recorrer indice
    //agregar getObservaciones

    public FichaRosa addObservacion(Observacion observacion){
        if (indiceObservaciones < this.observacion.length){
            this.observacion[indiceObservaciones++] = observacion;
        }
        return this;
    }

}
