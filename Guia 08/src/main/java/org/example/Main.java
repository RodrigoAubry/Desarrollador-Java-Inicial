package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Persona> personaL =new ArrayList<>();
        Scanner scn=new Scanner(System.in);
        String a="si";
        ManejarPersonas mp=new ManejarPersonas();
        int b=0;
        while (a.equals("si")) {
            personaL.add(b,mp.agregarPersona());
            b++;
            System.out.println("Quiere ingresar otra persona? \"si\" / \"no\" ");
            a = scn.next();

            //Quiero limpiar la pantalla de la consola cada vez que ingreso una persona pero no se como

        }
        System.out.println("Quiere ver las personas ingresadas \"si\" / \"no\" ");
        a=scn.next();
        if(a.equals("si")){
           mp.mostrarPersonas(personaL);
        }
    }
}