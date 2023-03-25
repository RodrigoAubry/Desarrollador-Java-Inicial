package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        Persona persona1=new Persona();
        List <Persona> personaL =new ArrayList<>();
        String a="si";
        int b=0;
        while (a.equals("si")) {
            System.out.println("Ingrese Nombre: ");
            persona1.setNombre(scn.next());
            System.out.println("Ingrese Apellido: ");
            persona1.setApellido(scn.next());
            System.out.println("Ingrese Fecha de Nacimiento \"dd,mm,aa\"");
            persona1.setFechaDeNacimiento(scn.next());
            personaL.add(b, persona1);
            b++;
            System.out.println("Quiere ingresar otra persona? \"si\" / \"no\" ");
            a = scn.next();

            //Quiero limpiar la pantalla de la consola cada vez que ingreso una persona pero no se como

        }
        System.out.println("Quiere ver las personas ingresadas \"si\" / \"no\" ");
        a=scn.next();
        if(a.equals("si")){
            for (int i = 0; i < personaL.size(); i++) {
                System.out.println("Nombre: " + persona1.getNombre());
                System.out.println("Apellido: " + persona1.getApellido());
                System.out.println("Fecha de nacimiento: " + persona1.getFechaDeNacimiento());
            }
        }
    }
}