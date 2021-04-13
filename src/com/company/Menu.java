package com.company;


import static com.company.Main.scanner;

public class Menu {

    String elegirOpcion(String[] opciones){

        boolean seguirPidiendo = true;
        String opcion = "";
        while(seguirPidiendo) {
            for (int i = 0; i < opciones.length; i++) {
                System.out.println((i + 1) + ". " + opciones[i]);
            }

            System.out.println("\nOpcion:");

            opcion = scanner.nextLine();
            try {

                if (Integer.valueOf(opcion) > opciones.length) {
                    Mensaje mensaje = new Mensaje();
                    mensaje.mostrarError("No existe la opcion");
                    mensaje.mostrarError("Escoge otro número ");
                } else {
                    seguirPidiendo = false;
                }
            } catch (Exception e) {
                System.out.println("Introduzca un numero");
                seguirPidiendo = false;
            }
        }
        return opcion;
    }
}
