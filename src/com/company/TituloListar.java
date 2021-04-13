package com.company;

public class TituloListar {

    void mostrarlistar(String titulo){
        System.out.println("\033[35m"+"************************");
        System.out.println("* " + titulo +"  *");
        System.out.println("************************"+"\033[0m");
    }
}

