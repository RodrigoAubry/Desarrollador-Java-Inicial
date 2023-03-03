public class b {
    public static void main(String[] args) {
        int numeros[] = new int []{4,7,2};
        int aux=0;
        String orden = "ascendente";

        if(orden.equals("ascendente")) {
            for (int n = 0; n < numeros.length; n++) {
                for (int i = 1; i < numeros.length - n; i++) {
                    if (numeros[i - 1] > numeros[i]) {
                        aux = numeros[i - 1];
                        numeros[i - 1] = numeros[i];
                        numeros[i] = aux;
                    }
                }
            }
        }else{
            for (int n = 0; n < numeros.length; n++) {
                for (int i = 1; i < numeros.length - n; i++) {
                    if (numeros[i - 1] < numeros[i]) {
                        aux = numeros[i - 1];
                        numeros[i - 1] = numeros[i];
                        numeros[i] = aux;
                    }
                }
            }
        }
        for(int num : numeros){
            System.out.println(num);
        }
    }
}
