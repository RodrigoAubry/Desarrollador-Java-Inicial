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

    public int edad() {
        LocalDate hoy=LocalDate.now();
        return  (hoy.getYear()-fechaDeNacimiento.getYear());       //Me falta comparar meses y días
    }
}
