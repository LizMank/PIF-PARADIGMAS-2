package co.edu.poli.PIF.vista;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import co.edu.poli.PIF.servicios.ImplementacionOperacion;
import co.edu.poli.PIF.modelo.Solicitud_Adopcion;
import co.edu.poli.PIF.modelo.Usuario;

public class Principal {

    public static void main(String[] args) {

        // Variables necesarias
       // String path = "ruta/del/archivo";
        //String file = "solicitudes.dat";
    	String path = "archivos"; 
    	String file = "solicitudes.dat";

    	
    	
        // Instanciar la clase de operaciones
        ImplementacionOperacion crud = new ImplementacionOperacion();
        ImplementacionOperacion op = new ImplementacionOperacion();

        // Crear usuarios
        Usuario u1 = new Usuario("Jhonatan", "HolaWapos", "cedulaciudadania", 
                "102548", 313285, "ValemosM0ndA", "calle85B-42", "bogota", "550000 pesos");
        Usuario u2 = new Usuario("Lizeth", "HolaBellezas", "cedulaciudadania", 
                "105835", 313287, "Kgada", "Avenida 50", "bogota", "30000000");
        Usuario u3 = new Usuario("Maia", "SoyMaia", "cedulaciudadania", 
                "5154654", 32151, "Queli", "autopista200", "bogota", "35000 pesos");

        // Crear solicitudes de adopción
        Solicitud_Adopcion s1 = new Solicitud_Adopcion(1234, "15 de Enero", "en espera", u1, "25 de febrero");
        Solicitud_Adopcion s2 = new Solicitud_Adopcion(4567, "20 de octubre", "Ya adoptado", u2, "26 de octubre");
        Solicitud_Adopcion s3 = new Solicitud_Adopcion(8910, "21 de abril", "no adoptado", u3, "25 de diciembre");

        // Operaciones CRUD
        System.out.println(crud.create(s3));
        System.out.println(crud.create(s2));

        // Almacenar en archivo
        op.serializar(crud.readall(), path, file);

        // Extraer estructura del archivo y asignar para hacer operaciones
        crud.setSolicitudes(op.deserializar(path, file));
        System.out.println("1. Lectura desde archivo: " + Arrays.toString(op.deserializar(path, file)));

        // Crear una solicitud vacía y hacer operaciones sobre ella
        Solicitud_Adopcion s4 = new Solicitud_Adopcion(482, "21 octubre", "En espera", u1, "31 octubre");
        System.out.println(crud.create(s4));
        System.out.println(crud.delete(1234));
        System.out.println(crud.create(s1));

        // Leer una solicitud específica
        s4 = crud.read(1234);
        if (s4 != null) {
            s4.setCodigo(123);  // Asegúrate de que este método exista en la clase
            System.out.println(crud.update(1234, s4));
        } else {
            System.out.println("Solicitud no encontrada.");
        }

        // Mostrar todas las solicitudes antes de guardar en archivo
        System.out.println("Antes de guardar archivo: " + Arrays.toString(crud.readall()));

        // Almacenar nuevamente en archivo
        op.serializar(crud.readall(), path, file);

        // Mostrar la lectura final desde archivo
        System.out.println("2. Lectura desde archivo: " + Arrays.toString(op.deserializar(path, file)));
    }
    
    
}
