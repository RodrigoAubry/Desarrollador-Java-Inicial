import java.util.List;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
public class Main {
    public static void main(String[] args)throws IOException {
        String abec="";
        String str1 ="";
        char aux='b';
        char a;
        int pasado;
        String cd;
        int dez;
        Scanner cdI = new Scanner(System.in);
        Scanner dezI=new Scanner(System.in);
        String resultado="";

        List<String> readAllLines = Files.readAllLines(Paths.get(".\\Abecedario.txt"));
        for (int i = 0; i < readAllLines.size(); i++) {
            abec = readAllLines.get(i);
        }
        List<String> readEntry = Files.readAllLines(Paths.get(".\\Entrada.txt"));
        for (int i = 0; i < readEntry.size(); i++) {
            str1 = readEntry.get(i);
        }
        System.out.println("Ingrese \"c\" si es una Codificación o \"d\" si es una Decodificación");
        cd=cdI.next();
        System.out.println("Ingrese el valor del desplazamiento");
        dez=dezI.nextInt();
        if(cd.equals("c")){
            for(int n=0;n<str1.length();n++){
                a=str1.charAt(n);
                for(int i=0;i<abec.length();i++){
                    if(a==abec.charAt(i)){
                        if(i+dez>27){
                            pasado=(i+dez)-27;
                            aux=abec.charAt(pasado);
                        }else{
                            aux=abec.charAt(i+dez);
                        }
                    }
                }
                resultado = resultado+aux;
            }
        }else{
            for(int n=0;n<str1.length();n++){
                a=str1.charAt(n);
                for(int i=0;i<abec.length();i++){
                    if(a==abec.charAt(i)){
                        if(i-dez<0){
                            pasado=(i-dez)+27;
                            aux=abec.charAt(pasado);
                        }else{
                            aux=abec.charAt(i-dez);
                        }
                    }
                }
                resultado = resultado+aux;
            }

        }
        Files.writeString(Paths.get(".\\Salida.txt"), resultado);
    }
}
