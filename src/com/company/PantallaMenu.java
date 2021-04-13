package com.company;

import java.io.File;
import java.util.Scanner;

public class PantallaMenu {

    boolean mostrar(){
        Titulo titulo = new Titulo();
        titulo.mostrar("AGENDA");    // // titulo = "AGENDA"

        Menu menu = new Menu();
        String[] opciones = {"AYUDA","LISTAR","BORRAR TODO", "SALIR"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            PantallaAyuda pantallaAyuda = new PantallaAyuda();
            pantallaAyuda.mostrarayuda();
        } else if("2".equals(opcion)) {
            PantallaListar pantallaListar = new PantallaListar();
            pantallaListar.mostrarlistar();
        } else if ("3".equals(opcion)){
            PantallaCrear pantallaCrear = new PantallaCrear();
            pantallaCrear.mostrarcrear();
        } else if ("4".equals(opcion)){
            Main.db.deleteTables();
        } else if("5".equals(opcion)) {
            return false;
        }
        return true;
    }
}
