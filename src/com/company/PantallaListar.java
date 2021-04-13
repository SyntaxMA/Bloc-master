package com.company;

import java.util.List;

public class PantallaListar {

    void mostrarlistar(){
        BaseDeDatos.createTables();
        TituloListar titulolistar = new TituloListar();
        titulolistar.mostrarlistar("CONTACTOS GUARDADOS");

        List<Nota> Lista = Main.db.listaNota();

        if (Lista.size() == 0){
            Mensaje mensaje = new Mensaje();
            mensaje.mostrarWarn("No hay contactos guardados");
        } else {
            int i = 1;
            for(Nota nota: Main.db.listaNota()){
                System.out.print(i + ". ");
                System.out.print(nota.favorito ? "<3 " : "");
                System.out.print(nota.nombre + " ");
                System.out.print(nota.apellido + " ");
                System.out.print(nota.telefono + " ");
                System.out.println(nota.correo + " ");
                i++;
            }
            System.out.println();
        }
    }
}


