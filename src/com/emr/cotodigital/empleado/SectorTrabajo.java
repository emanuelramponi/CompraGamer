package com.emr.cotodigital.empleado;

public enum SectorTrabajo {

    CARNICERIA("Carniceria"),
    LACTEOS("Lacteos"),
    VERDULERIA("Verduleria"),
    CAJAS("Cajas"),
    SALON("Salon"),
    ENVIOS("Envios"),
    DIGITAL("Digital"),
    MAESTRANZA("Maestranza"),
    MANTENIMIENTO("Mantenimiento"),
    ADMINISTRACION("Administracion"),
    RECURSOSHUMANOS("Recursos Humanos");

    private final String sectorTrabajo;

    SectorTrabajo (String sectorTrabajo) { this.sectorTrabajo = sectorTrabajo; }

    @Override
    public  String toString() { return this.sectorTrabajo; }

}
