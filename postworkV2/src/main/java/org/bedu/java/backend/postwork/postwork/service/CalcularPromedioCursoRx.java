package org.bedu.java.backend.postwork.postwork.service;

import org.bedu.java.backend.postwork.postwork.model.Curso;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.stream.Collectors;

public class CalcularPromedioCursoRx {//Esto tambien puede ser parte de los servicios
    public Mono<Double> calcularPromedio(Curso curso){

        return Flux.fromStream(curso.getCalificaciones().values().parallelStream())
                .collect(Collectors.averagingDouble(i -> (double) i));

    }
}
