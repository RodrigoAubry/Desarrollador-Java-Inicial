import java.time.LocalDate;
public class Carrito {

    //Atributos

    private Producto[] productos;

    private LocalDate fechaDeCompra;

    //Constructor

    public Carrito(){
       this.productos=new Producto[3];

       this.fechaDeCompra=LocalDate.now();
    }

    //Metodos


    public Producto[] getProductos() {
        return productos;
    }
}
