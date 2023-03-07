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

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    public float precio(){
        float aux=0;
        for (int n = 0; n < 3; n++) {
            aux=productos[n].getPrecio()+aux;
        }
        return aux;
       //aux = productos[0].getPrecio()+productos[1].getPrecio()+productos[2].getPrecio();
    }
}
