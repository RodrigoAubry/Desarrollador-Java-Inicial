public class DescuentoSobre0Exception extends Exception {
    public DescuentoSobre0Exception(){
        System.out.println("No se puede aplicar descuento a un carrito que vale $0");
    }
}
