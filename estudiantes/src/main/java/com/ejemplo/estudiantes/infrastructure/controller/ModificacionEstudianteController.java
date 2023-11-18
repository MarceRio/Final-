package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.CreacionEstudianteService;
import com.ejemplo.estudiantes.application.ModificacionEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("estudiantes")
@Slf4j
@RequiredArgsConstructor
public class ModificacionEstudianteController {

    private final ModificacionEstudianteService modificacionEstudianteService;

    @PutMapping("{id}")
    public Estudiante modificarEstudiante(@PathVariable ("id") Long estudianteId, @RequestBody Estudiante estudiante ){

        log.info("Se va a modificar un estudiante");

        return modificacionEstudianteService.modificarEstudiante(estudianteId, estudiante);



    }



}
