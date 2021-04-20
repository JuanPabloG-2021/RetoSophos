package com.sophos.reto.certificacion;

public class PlantillaCliente {
    private String Nombre;
    int Cedula;
    String TipoDocumento;

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        TipoDocumento = tipoDocumento;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;


    }
}
