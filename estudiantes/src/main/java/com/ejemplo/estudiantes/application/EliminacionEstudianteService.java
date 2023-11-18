package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.repository.EstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EliminacionEstudianteService {

    private final EstudianteRepository eliminarEstudianteRepositorio;

    public void eliminarEstudiante(Long estudianteId) {
        eliminarEstudianteRepositorio.deleteById(estudianteId);


    }





}
