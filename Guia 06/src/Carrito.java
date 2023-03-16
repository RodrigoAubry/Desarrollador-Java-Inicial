import java.time.LocalDate;
public class Carrito {

    //Atributos
    float totalBas=0;
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

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    public float totalBase(){
        for (int n = 0; n < 3; n++) {
            totalBas+=productos[n].getPrecioBase();
        }
        return totalBas;
    }


}