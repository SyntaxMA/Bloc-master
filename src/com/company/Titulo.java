package com.company;

public class Titulo {

    void mostrar(String titulo){
        System.out.println("\033[31m"+"*******************");
        System.out.println("*     " + titulo +"      *");
        System.out.println("*******************"+"\033[0m");
    }
}


