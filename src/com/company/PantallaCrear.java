package com.company;


//    \033[   m

public class PantallaCrear {

    void mostrarcrear() {
        Titulocrear titulocrear = new Titulocrear();
        titulocrear.mostrarcrear("CREAR CONTACTO");     // titulo = "CREAR CONTACTO"

        BaseDeDatos.createTables();

        String elegir = "";

        Nota nota = new Nota("Nombre", "Apellido", "Telefono", "Email", true);
        Casilla casilla = new Casilla();

        nota.nombre = casilla.pedir("Nombre del contacto");
        nota.apellido = casilla.pedir("Apellido del contacto:");
        nota.telefono = casilla.pedir("Telefono del contacto:");

        System.out.println("Quieres añadirle un correo electrónico?");
        System.out.println("Escriba Si o No");
        elegir = Main.scanner.nextLine();

        nota.correo = "";

        if ("Si".equals(elegir)) {
            System.out.println("Correo del contacto:");
            nota.correo = Main.scanner.nextLine();
            System.out.println("Añadir contacto a favoritos?");
            System.out.println("Escriba Si o No");

        } else if ("No".equals(elegir)){
            System.out.println("Añadir contacto a favoritos?");
            System.out.println("Escriba Si o No");
        }
        elegir = Main.scanner.nextLine();


        boolean favorito = false;
        if ("Si".equals(elegir)) {
            System.out.println("Contacto añadido a favoritos");
            nota.favorito = true;
        } else if ("No".equals(elegir)){
            System.out.println("Contacto NO añadido a favoritos");
            favorito = false;

        }
        Main.db.insertNota(nota.nombre, nota.apellido, nota.telefono, nota.correo , favorito );

        Mensaje mensaje = new Mensaje();
        mensaje.mostrarInfo("¡Se ha guardado tu contacto!");

    }
}
