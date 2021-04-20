package com.sophos.reto.certificacion;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RegistrarCliente extends PlantillaCliente {

    public void registrar(Scanner sc, Map<Integer, List<Object>> clientes){
        System.out.println("|*|*|*|Binvenido al registro de usuarios|*|*|*|");
        System.out.println("|*|*|*|Ingrese la cedula del cliente|*|*|*|*|*|");
        setCedula(sc.nextInt());
        System.out.println("|*|*|*|Ingrese el tipo de documento|*|*|*|*|*|");
        setTipoDocumento(sc.next());
        System.out.println("|*|*|*|Ingrese el nombre del cliente|*|*|*|*|*|");
        setNombre(sc.next());

        List<Object> datosCliente = new ArrayList<Object>();
        datosCliente.add(getCedula());
        datosCliente.add(getTipoDocumento());
        datosCliente.add(getNombre());

        clientes.put(getCedula(), datosCliente);

    }
}
