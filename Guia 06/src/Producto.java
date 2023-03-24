public class Producto {
    //Atributos
    private String nombre;
    private float precioBase;

    //Constructor

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    //Metodos

    public void setPrecioBase(float precioBase){
        this.precioBase = precioBase;
    }
    public float getPrecioBase(){
        return precioBase;
    }

}