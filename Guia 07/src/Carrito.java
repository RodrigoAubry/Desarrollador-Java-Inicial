import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Carrito {

    //Atributos
    float totalBas;
    private List<Producto> productos;
    private LocalDate fechaDeCompra;


    //Constructor

    public Carrito(){
        this.productos=new ArrayList<Producto>();
        this.fechaDeCompra=LocalDate.now();
    }

    //Metodos


    public List<Producto> getProductos() {
        return productos;
    }

    public LocalDate getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void agregarProducto(Producto prod) {
        this.productos.add(prod);
    }
    public void quitarItem(Producto prod) {
        this.productos.remove(prod);
    }

    public float getTotalBas() {
        return totalBas;
    }

    public void calcularTotalBase(){
        this.totalBas=0;
        List<Producto> productoList = this.productos;
        for (int i = 0; i < productoList.size(); i++) {
            Producto prod = productoList.get(i);
            float precioprod = prod.getPrecioBase();
            totalBas += precioprod;
        }
    }
}

