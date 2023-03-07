import java.time.LocalDate;
public class Persona {

    //Atributos
    private String nombre;
    private  String apellido;
    private LocalDate fechaDeNacimiento;

    //Constructor
    public Persona(String nombre,String apellido,LocalDate fechaDeNacimiento){
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechaDeNacimiento=fechaDeNacimiento;
    }

    //Metodos

    public int edad(LocalDate fechaDeNacimiento) {
        LocalDate hoy=LocalDate.now();
       int  eda=hoy.getYear()-fechaDeNacimiento.getYear();
       return eda;
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
}
