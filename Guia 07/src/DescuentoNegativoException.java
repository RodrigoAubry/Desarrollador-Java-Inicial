public class DescuentoNegativoException extends Exception {
    public DescuentoNegativoException(){
        System.out.println("No se puede aplicar descuento porque es negativo");
    }
}
