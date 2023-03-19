import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate cumple =LocalDate.of(1990,9,12);
        Persona cliente=new Persona("Juan","Aragorn",cumple);
        float tope=Float.parseFloat(args[2]); //El tope es un porcentaje del total a pagar
        Carrito car1=new Carrito();

        Producto prod1=new Producto("Jabón en polvo",(float)40);
        car1.agregarProducto(prod1);
        Producto prod2=new Producto("Esponjas",(float)10);
        car1.agregarProducto(prod2);
        Producto prod3=new Producto("Chocolate",(float)100);
        car1.agregarProducto(prod3);

        car1.calcularTotalBase();
        System.out.println("El precio base es $"+car1.getTotalBas());

        switch (args[1]){
            case "f": System.out.println("Hay descuento fijo de $"+args[0]);
                DescuentoFijo df =new DescuentoFijo(car1.getTotalBas(),Float.parseFloat(args[0]));
                df.calcularDescuento();
                System.out.println("Total a pagar $"+df.getTp());
                break;
            case "p":
                if (tope<Float.parseFloat(args[0])) {
                    System.out.println("Hay descuento del "+args[2]+"%");
                    DescuentoPorcentajeConTope dpct =new DescuentoPorcentajeConTope(car1.getTotalBas(),tope);
                    dpct.calcularDescuento();
                    System.out.println("Total a pagar $" + dpct.getTp());
                }else{
                    System.out.println("Hay descuento del "+args[0]+"%");
                    DescuentoPorcentaje dp = new DescuentoPorcentaje(car1.getTotalBas(), Float.parseFloat(args[0]));
                    dp.calcularDescuento();
                    System.out.println("Total a pagar $" + dp.getTp());
                }
                break;
        }
    }
}