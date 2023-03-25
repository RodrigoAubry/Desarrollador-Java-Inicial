package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Persona {
    @Setter @Getter
    private String nombre;
    @Setter @Getter
    private String apellido;
    @Setter @Getter
    private String fechaDeNacimiento;

}
