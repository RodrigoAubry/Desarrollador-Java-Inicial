package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class Persona {
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String apellido;
    @Setter @Getter
    private String fechaDeNacimiento;

}
