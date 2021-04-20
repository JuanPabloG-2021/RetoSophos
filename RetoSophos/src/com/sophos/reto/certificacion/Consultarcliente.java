package com.sophos.reto.certificacion;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Consultarcliente {

    public void consultar (Scanner sc, Map<Integer, List<Object>> clientes){

        System.out.println("|*|*|*|Binvenido al registro de usuarios|*|*|*|");
        System.out.println("|*|*|*|Ingrese la cedula del cliente|*|*|*|*|*|");


        System.out.println(clientes.get(sc.nextInt()));
    }
}
