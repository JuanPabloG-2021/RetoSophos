
package com.sophos.reto.certificacion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class InterfazConsola extends PlantillaCliente {
    Map<Integer, List<Object>> clientes = new HashMap<>();

    int Response;
    int Consulta;
    int Eliminar;

    Scanner Read = new Scanner(System.in);

    public void Interfaz() {

        while (Response < 5) {
            System.out.println("seleccione la opcion:\n" +
                    "1. Registrar cliente \n" +
                    "2. Editar cliente \n" +
                    "3. Eliminar cliente \n" +
                    "4. Consultar cliente \n" +
                    "5. Salir del menu");
            Response = Integer.parseInt(Read.next());

            if (Response == 1) {
                RegistrarCliente rc = new RegistrarCliente();
                rc.registrar(Read, clientes);

            }
            if (Response == 2) {
                EditarCliente ed = new EditarCliente();
                ed.editar(Read, clientes);

            }
            if (Response == 3) {
                EliminarCliente Ec = new EliminarCliente();
                Ec.eliminar(Read, clientes);


            }


            if (Response == 4) {
                Consultarcliente cc = new Consultarcliente();
                cc.consultar(Read, clientes);


            }
        }
    }
}
