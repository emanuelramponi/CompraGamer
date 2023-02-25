package com.emr.cotodigital.empleado;

public class FichaRosa {
    private LlegadasTarde[] llegadasTarde;
    private Sanciones[] sanciones;
    private Observacion[] observacion;

    private int indiceObservaciones;
    private int indiceSanciones;
    private int indiceLlegadasTarde;

    FichaRosa(){
        this.llegadasTarde = new LlegadasTarde[5];
        this.sanciones = new Sanciones[3];
        this.observacion = new Observacion[7];
    }


    public LlegadasTarde[] getLlegadasTarde(){return this.llegadasTarde;}
    public Sanciones[] getSanciones() {return this.sanciones;}

    public Observacion[] getObservacion(){return this.observacion;}

    //agregar getObservaciones

    public FichaRosa addObservacion(Observacion observacion){
        if (indiceObservaciones < this.observacion.length){
            this.observacion[indiceObservaciones++] = observacion;
        }
        return this;
    }

    public FichaRosa addSanciones(Sanciones sanciones){
        if(indiceSanciones < this.sanciones.length){
            this.sanciones[indiceSanciones++] = sanciones;
        }
        return this;
    }

    public FichaRosa addLlegadasTarde(LlegadasTarde llegadasTarde){
        if(indiceLlegadasTarde < this.llegadasTarde.length){
            this.llegadasTarde[indiceLlegadasTarde++] = llegadasTarde;
        }
        return this;
    }



}
