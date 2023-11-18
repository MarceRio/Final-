package com.ejemplo.estudiantes.infrastructure.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.estudiantes.application.VerEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;



import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class VerEstudianteController {

    private final VerEstudianteService verEstudianteService;

    @GetMapping
    public List<Estudiante> obtenerEstudiantes() {
        log.info("Se están pidiendo todos los estudiantes");
        return verEstudianteService.obtenerEstudiantes();
    }

    @GetMapping("{id}")
    public Estudiante obtenerEstudiante (@PathVariable ("id") Long estudianteId) {
        return verEstudianteService.obtenerEstudiante(estudianteId);
    }




}
        


