package com.ejemplo.estudiantes.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Estudiante {

    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    
}
