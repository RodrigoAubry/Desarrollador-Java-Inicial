public class DescuentosException extends Exception {
    public DescuentosException(float base){
        if(base==0){
            System.out.println("No se puede aplicar descuento a un carrito que vale $0");
        }else{
            System.out.println("No se puede aplicar descuento porque el resultado es negativo");
        }
    }
}
