package com.sophos.reto.certificacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EditarCliente extends PlantillaCliente{

    public void editar(Scanner sc, Map<Integer, List<Object>> clientes){
        System.out.println("|*|*|*|Binvenido a la opcion de eliminacionde usuario|*|*|*|");
        System.out.println("|*|*|*|Ingrese la cedula del cliente|*|*|*|*|*|");
        setCedula(sc.nextInt());
        System.out.println("|*|*|*|Ingrese el tipo de documento|*|*|*|*|*|");
        setTipoDocumento(sc.next());
        System.out.println("|*|*|*|Ingrese el nombre del cliente|*|*|*|*|*|");
        setNombre(sc.next());

        List<Object> datosCliente = new ArrayList<Object>();
        datosCliente.add(getTipoDocumento());
        datosCliente.add(getNombre());
        datosCliente.add((getCedula()));


        clientes.replace(getCedula(), datosCliente);



    }
}
