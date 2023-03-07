import java.lang.reflect.Array;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate cumple =LocalDate.of(1990,9,12);
        Persona cliente=new Persona("Juan","Aragorn",cumple);

        Producto prod[]=new Producto[3];
        prod[0]=new Producto("Jabón en polvo");
        prod[0].setPrecio(40);
        prod[1]=new Producto("Esponjas");
        prod[1].setPrecio(10);
        prod[2]=new Producto("Chocolate");
        prod[2].setPrecio(100);

        Carrito car1=new Carrito();
        car1.setProductos(prod);

       System.out.println(car1.precio());
       //System.out.println(cliente.edad());


    }
}