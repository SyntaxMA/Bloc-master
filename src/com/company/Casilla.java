package com.company;

public class Casilla {
    String pedir(String prompt){
        System.out.println("\033[31m" + prompt + "\033[0m");

        return Main.scanner.nextLine();
    }
}
