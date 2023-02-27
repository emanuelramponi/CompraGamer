package com.emr.cotodigital;

public class Persona {

    private String name;
    private String apellido;
    private int documento;
    private String telefono;

    public Persona(){ Persona persona = new Persona();}
    public Persona(String name){ this.name = name;}

    public Persona(String name ,String apellido){
        this(name);
        this.apellido = apellido;
    }

    public Persona (String name, String apellido, int documento){
        this(name, apellido);
        this.documento = documento;
    }

    public Persona (String name, String apellido, int documento, String telefono){
        this(name, apellido, documento);
        this.telefono = telefono;
    }

    public String getName(){return this.name;}
    public String getApellido(){return this.apellido;}
    public int getDocumento(){return this.documento;}
    public String getTelefono(){return this.telefono;}

    public void setName(String name) {this.name = name;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setDocumento(int documento) {this.documento = documento;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
