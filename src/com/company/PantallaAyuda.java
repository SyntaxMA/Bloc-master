package com.company;

public class PantallaAyuda {

    void mostrarayuda(){
        Tituloayuda tituloayuda = new Tituloayuda();
        tituloayuda.mostrarayuda("AYUDA");

        Mensaje mensaje = new Mensaje();

        System.out.println("Pequeña ayuda para principiantes:");
        System.out.println("En la agenda puedes crear y listar los contactos");
        System.out.println("Para listar los contactos debes escoger la opcion 2, al listar puedes ver los nombres de los contactos ");
        System.out.println("Para borrar todos los contactos debes escoger la opcion 3, CUIDADO una vez borrado no se puede recuperar");
        System.out.println("Para salir de la agenda escoga la opción 4");

    }
}
