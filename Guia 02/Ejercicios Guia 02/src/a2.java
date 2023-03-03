public class a2 {
    public static void main(String[] args) {
        String abec = "abcdefghijklmnopqrstuvwxyz ";
        String str1 = "ahola que tal";
        String resultado="";
        char aux='b';
        char a;
        int pasado;

        for(int n=0;n<str1.length();n++){
            a=str1.charAt(n);
            for(int i=0;i<abec.length();i++){
                if(a==abec.charAt(i)){
                    if(i+2>27){
                        pasado=(i+2)-27;
                        aux=abec.charAt(pasado);
                    }else{
                        aux=abec.charAt(i+2);
                    }
                }
            }
            resultado = resultado+aux;
        }
        System.out.println(resultado);
    }
}
