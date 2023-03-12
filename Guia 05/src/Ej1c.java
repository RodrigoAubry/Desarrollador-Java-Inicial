import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Ej1c {

    public static void main(String[] args) {
        Integer[] num = new Integer[3];
        String orden="";
        if(args.length==0){    //No estoy seguro que sea la mejor forma para saber si hay datos en args
            Scanner scn = new Scanner(System.in);
            for (int n = 0; n < num.length; n++) {
                System.out.println("Ingrese un número y presione \"enter\"");
                num[n]=scn.nextInt();
            }
            System.out.println("Ingrese \"a\" si quiere orden ascendente o \"d\" si quiere orden descendente" );
            orden =scn.next();
        }else{
            orden = args[3];
            for (int i = 0; i < args.length - 1; i++) {
                num[i] = Integer.parseInt(args[i]);
            }
        }
        ordenar(num,orden);
        System.out.println(Arrays.toString(num));
    }
    private static void ordenar(Integer[] numeros,String orden){

        if(orden.equals("a")){
            Arrays.sort(numeros);
        }else {
            Arrays.sort(numeros,Collections.reverseOrder());
        }
    }

}
