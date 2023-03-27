package org.example;
import java.util.List;
import java.util.Scanner;

public class ManejarPersonas {
    Scanner scn=new Scanner(System.in);
    Persona persona1=new Persona();


    public Persona agregarPersona(){
        System.out.println("Ingrese Nombre: ");
        persona1.setNombre(scn.next());
        System.out.println("Ingrese Apellido: ");
        persona1.setApellido(scn.next());
        System.out.println("Ingrese Fecha de Nacimiento \"dd,mm,aa\"");
        persona1.setFechaDeNacimiento(scn.next());

        return persona1;
    }

    public void mostrarPersonas(List personaL){
        for (int i = 0; i < personaL.size(); i++) {
            System.out.println("Nombre: " + persona1.getNombre());
            System.out.println("Apellido: " + persona1.getApellido());
            System.out.println("Fecha de nacimiento: " + persona1.getFechaDeNacimiento());
        }
    }
}
