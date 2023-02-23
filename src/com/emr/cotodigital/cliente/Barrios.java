package com.emr.cotodigital.cliente;

public enum Barrios {
    AGRONOMIA("Agronomia"),
    ALMAGRO("Almagro"),
    BALVANERA("Balvanera"),
    BARRACAS("Barracas"),
    BELGRANO("Belgrano"),
    LABOCA("La Boca"),
    BOEDO("Boedo"),
    CABALLITO("Caballito"),
    CHACARITA("Chacarita"),
    COGHLAN("Coghlan"),
    COLEGIALES("Colegiales"),
    CONSTITUCION("Constitucion"),
    FLORES("Flores"),
    FLORESTA("Floresta"),
    LINIERS("Liniers"),
    MATADEROS("Mataderos"),
    MONSERRAT("Monserrat"),
    MONTECASTRO("Monte Castro"),
    NUEVAPOMPEYA("Nueva Pompeya"),
    NUNEZ("Nunez"),
    PALERMO("Palermo"),
    PARQUEAVELLANEDA("Parque Avellaneda"),
    PARQUECHACABUCO("Parque Chacabuco"),
    PARQUECHAS("Parque Chas"),
    PARQUEPATRICIOS("Parque Patricio"),
    PATERNAL("Paternal"),
    PUERTOMADERO("Puerto Madero"),
    RECOLETA("Recoleta"),
    RETIRO("Retiro"),
    SAAVEDRA("Saavedra"),
    SANCRISTOBAL("San Cristobal"),
    SANNICOLAS("San Nicolas"),
    SANTELMO("San Telmo"),
    VELEZSARSFIELD("Velez Sarsfield"),
    VERSALLES("Versalles"),
    VILLACRESPO("Villa Crespo"),
    VILLADELPARQUE("Villa del Parque"),
    VILLADEVOTO("Villa Devoto"),
    VILLAGENERALMITRE("Villa General Mitre"),
    VILLALUGANO("Villa Lugano"),
    VILLALURO("Villa Luro"),
    VILLAORTUZAR("Villa Ortuzar"),
    VILLAPUEYRREDON("Villa Pueyrredon"),
    VILLAREAL("Villa Real"),
    CILLARIACHUELO("Cilla Riachuelo"),
    SANTARITA("Santa Rita"),
    VILLASOLDATI("Villa Soldati"),
    VILLAURQUIZA("VIlla Urquiza");

    private final String barrio;

    Barrios (String barrio) { this.barrio = barrio; }

    public String getBarrio() { return this.barrio;}

    @Override
    public String toString(){ return this.barrio;}
}
