package com.ejemplo.estudiantes.infrastructure.repository.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="estudiante")
@Data
@Builder
@NoArgsConstructor //Agrega el constructor que no tiene parametros
@AllArgsConstructor //Agrega el constructor que tiene todos los parametros
public class EstudianteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "edad")
    private int edad;
    
}
