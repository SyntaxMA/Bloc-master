package com.company;


import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static BlocDeNotas blocDeNotas = new BlocDeNotas();
    static BaseDeDatos db = BaseDeDatos.get();

    public static void main(String[] args) {

        db.deleteTables();
        db.createTables();

        PantallaMenu pantallaMenu = new PantallaMenu();
        while(pantallaMenu.mostrar()) { }
    }
}
















/*



Nota
   Titulo
   Contenido

Lista de notas

Menu
    Opcion

Pantalla
    PantallaBusqueda
    Pantalla.....

Titulo

LineaAsteriscos

Mensaje

Campo
   CampoLineaTexto
   CampoMultiLinea
   CampoNumerico
   CampoAnyKey

 */