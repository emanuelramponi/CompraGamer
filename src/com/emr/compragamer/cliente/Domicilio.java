package com.emr.compragamer.cliente;

public class Domicilio {
    private String calle;
    private int altura;
    private int codigoPostal;
    private TipoDomicilio tipoDomicilio;
    private Barrios barrio;
    private String departamento_timbre;
    private String observaciones;


    public Domicilio(){}

    public Domicilio(String calle){ this.calle = calle; }

    public Domicilio(String calle, int altura){
        this(calle);
        this.altura = altura;
    }

    public Domicilio(String calle, int altura, int codigoPostal){
        this(calle, altura);
        this.codigoPostal = codigoPostal;
    }

    public Domicilio (String calle, int altura, int codigoPostal, TipoDomicilio tipoDomicilio){
        this(calle, altura, codigoPostal);
        this.tipoDomicilio = tipoDomicilio;
    }

    public Domicilio (String calle, int altura, int codigoPostal, TipoDomicilio tipoDomicilio, Barrios barrio){
        this(calle, altura, codigoPostal, tipoDomicilio);
        this.barrio = barrio;
    }

    public Domicilio(String calle, int altura, int codigoPostal, TipoDomicilio tipoDomicilio ,Barrios barrio , String departamento_timbre){
        this(calle, altura, codigoPostal,tipoDomicilio,barrio);
        if(departamento_timbre == null){
            this.departamento_timbre = null;
        }
    }

    public Domicilio(String calle, int altura, int codigoPostal, TipoDomicilio tipoDomicilio, Barrios barrio ,String departamento_timbre, String observaciones){
        this(calle, altura, codigoPostal, tipoDomicilio, barrio ,departamento_timbre);
        if(observaciones == null){
            this.observaciones = null;
        }
    }


    public String getCalle(){ return this.calle; }

    public int getAltura(){ return this.altura; }

    public int getCodigoPostal(){ return this.codigoPostal; }

    public TipoDomicilio getTipoDomicilio () { return tipoDomicilio; }

    public String getDepartamento_timbre(){ return this.departamento_timbre; }

    public String getObservaciones(){ return this.observaciones; }

    public Barrios getBarrio() { return this.barrio; }


    public void setCalle(String calle){ this.calle = calle; }

    public void setAltura(int altura){ this.altura = altura; }

    public void setCodigoPostal(int codigoPostal){ this.codigoPostal = codigoPostal; }

    public void setDepartamento_timbre(String departamento_timbre) { this.departamento_timbre = departamento_timbre; }

    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    public void setBarrio(Barrios barrio){ this.barrio = barrio; }


    public String getDomicilio(){
        StringBuilder sb = new StringBuilder();

        sb.append(getCalle()).append(" ").append(getAltura());

        if(departamento_timbre != null) { sb.append(getDepartamento_timbre()); }

        sb.append(getTipoDomicilio()).append(", C").append(getCodigoPostal()).append(", ").append(getBarrio());

        sb.append(", CABA, Argentina");

        return sb.toString();
    }


}
