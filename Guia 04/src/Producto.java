import java.time.LocalDate;
public class Producto {
    //Atributos
    private String nombre;
    private String descripcion;
    private LocalDate fechaDeAlta;
    private float precio;

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
    public void setDescipcion(String descripcion){
        this.descripcion=descripcion;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }

}
