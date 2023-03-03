public class a {
    public static void main(String[] args) {
        String letras = "qwertyasdfgzxcvaswda";
        int contadorLetra=0;
        char letraBuscada = 'a';

        for (int n=0;n<letras.length();n++){
            if(letras.charAt(n)==letraBuscada){
                contadorLetra++;
            }
        }
        System.out.println(contadorLetra);
    }
}