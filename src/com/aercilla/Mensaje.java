package com.aercilla;
import module java.base;

public class Mensaje {
        public String solicitarDatos (String mensaje){
            System.out.print(mensaje);
            Scanner escaner = new Scanner(System.in);
            return escaner.nextLine();
        }

    public void saludar(String nombre) {
            System.out.printf("Hola %s, bienvenido a Java\n", nombre);
    }
}
