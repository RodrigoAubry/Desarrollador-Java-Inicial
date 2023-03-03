public class c {
    public static void main(String[] args) {
        int numeros[] = new int []{4,7,2,6,5,9};
        int numX=3;
        int resultado=0;

        for(int n=0;n<numeros.length;n++){
            if(numeros[n]>numX){
                resultado=numeros[n]+resultado;
            }
        }
        System.out.println(resultado);
    }
}
