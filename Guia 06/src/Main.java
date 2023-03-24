import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate cumple =LocalDate.of(1990,9,12);
        Persona cliente=new Persona("Juan","Aragorn",cumple);
        float tope=Float.parseFloat(args[2]); //El tope es un porcentaje del total a pagar

        Producto prod[]=new Producto[3];
        prod[0]=new Producto("Jabón en polvo");
        prod[0].setPrecioBase(40);
        prod[1]=new Producto("Esponjas");
        prod[1].setPrecioBase(10);
        prod[2]=new Producto("Chocolate");
        prod[2].setPrecioBase(100);

        Carrito car1=new Carrito();
        car1.setProductos(prod);
        car1.calcularTotalBase();
        System.out.println("El precio base es $"+car1.getTotalBas());

        System.out.println("Total a pagar $" + car1.totalAPagar(args[1], Float.parseFloat(args[0]),Float.parseFloat(args[2])));
    }
}
