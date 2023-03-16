import java.time.LocalDate;
public class Producto {
    //Atributos
    private String nombre;
    private String descripcion;
    private LocalDate fechaDeAlta;
    private float precioBase;

    //Constructor

    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaDeAlta = LocalDate.now();
    }

    //Metodos


    public String getNombre() {
        return nombre;
    }
    public String getDescipcion(){
        return descripcion;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setDescipcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setPrecioBase(float precioBase){
        this.precioBase = precioBase;
    }
    public float getPrecioBase(){
        return precioBase;
    }

}