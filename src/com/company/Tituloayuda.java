package com.company;

public class Tituloayuda {

    void mostrarayuda(String titulo){
        System.out.println("\033[30m"+"*******************");
        System.out.println("* " + titulo +"  *");
        System.out.println("*******************"+"\033[0m");
    }
}