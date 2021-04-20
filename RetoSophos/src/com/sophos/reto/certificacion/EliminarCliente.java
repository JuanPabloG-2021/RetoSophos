package com.sophos.reto.certificacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EliminarCliente {

    public void eliminar (Scanner sc, Map<Integer, List<Object>> clientes){
        System.out.println("|*|*|*|Binvenido la eliminacion de usuarios|*|*|*|");
        System.out.println("|*|*|*|Ingrese la cedula del cliente|*|*|*|*|*|");



        clientes.remove(sc.nextInt());
        System.out.println("removido con exito");


    }
}
