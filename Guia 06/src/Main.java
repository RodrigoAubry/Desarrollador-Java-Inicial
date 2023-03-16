import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate cumple =LocalDate.of(1990,9,12);
        Persona cliente=new Persona("Juan","Aragorn",cumple);

        Producto prod[]=new Producto[3];
        prod[0]=new Producto("Jabón en polvo");
        prod[0].setPrecioBase(40);
        prod[1]=new Producto("Esponjas");
        prod[1].setPrecioBase(10);
        prod[2]=new Producto("Chocolate");
        prod[2].setPrecioBase(100);

        Carrito car1=new Carrito();
        car1.setProductos(prod);

        System.out.println("El precio base es $"+car1.totalBase());

        int a=Integer.parseInt(args[0]);
        switch (args[1]){
            case "f": System.out.println("Hay descuento fijo de $"+args[0]);
            DescuentoFijo df =new DescuentoFijo(car1.totalBase(),Float.parseFloat(args[0]));
            df.calcularDescuento();
            System.out.println("Total a pagar $"+df.getTp());
            break;
            case "p": System.out.println("Hay descuento del "+args[0]+"%");
            DescuentoPorcentaje dp =new DescuentoPorcentaje(car1.totalBase(),Float.parseFloat(args[0]));
            dp.calcularDescuento();
            System.out.println("Total a pagar $"+dp.getTp());
            break;
        }
    }
}

