package org.bedu.java.backend.postwork.postwork.reactive;

import org.bedu.java.backend.postwork.postwork.model.Curso;
import org.bedu.java.backend.postwork.postwork.model.Estudiante;
import org.bedu.java.backend.postwork.postwork.model.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CalcularPromedioCursoRxTest {
    private static final Curso CURSO = new Curso();

    static {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Estudiante Uno");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Estudiante Dos");

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Estudiante Tres");

        Materia materia = new Materia();
        materia.setNombre("Materia");

        CURSO.setCiclo("2030");
        CURSO.setMateria(materia);

        Map<Estudiante, Integer> calificaciones = new HashMap<>();
        calificaciones.put(estudiante1, 5);
        calificaciones.put(estudiante2, 8);
        calificaciones.put(estudiante3, 10);

        CURSO.setCalificaciones(calificaciones);
    }

    @Test
    @DisplayName("Postwork 5")
    void calculaPromedio(){
        CalcularPromedioCursoRx sut = new CalcularPromedioCursoRx();

        sut.calcularPromedio(CURSO)
                .subscribe(v -> assertThat(v).isEqualTo(7.66, within(0.1)));

    }

}