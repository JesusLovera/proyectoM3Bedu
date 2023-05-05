package org.bedu.java.backend.postwork.postwork.service;

import org.bedu.java.backend.postwork.postwork.model.Curso;
import org.bedu.java.backend.postwork.postwork.model.Estudiante;
import org.bedu.java.backend.postwork.postwork.model.Materia;
import org.bedu.java.backend.postwork.postwork.service.ReporteCalificaciones;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

class ReporteCalificacionesTest {
    private static final Materia MATERIA = new Materia();
    private static final Estudiante ESTUDIANTE_1 = new Estudiante();
    private static final Estudiante ESTUDIANTE_2 = new Estudiante();
    private static final Estudiante ESTUDIANTE_3 = new Estudiante();
    private static final Curso CURSO = new Curso();

    private static ReporteCalificaciones.Reporte reporte1;
    private static ReporteCalificaciones.Reporte reporte2;
    private static ReporteCalificaciones.Reporte reporte3;

    static{
        MATERIA.setNombre("Matemáticas");

        ESTUDIANTE_1.setNombre("ccc");
        ESTUDIANTE_2.setNombre("bbb");
        ESTUDIANTE_3.setNombre("aaa");

        CURSO.setCiclo("2030");
        CURSO.setMateria(MATERIA);

        Map<Estudiante,Integer> calificaciones = new HashMap<>();
        calificaciones.put(ESTUDIANTE_1, 8);
        calificaciones.put(ESTUDIANTE_2, 5);
        calificaciones.put(ESTUDIANTE_3, 10);

        CURSO.setCalificaciones(calificaciones);

        reporte1 = new ReporteCalificaciones.Reporte("ccc", 8);
        reporte2 = new ReporteCalificaciones.Reporte("bbb", 5);
        reporte3 = new ReporteCalificaciones.Reporte("aaa", 10);


    }

    @Test
    @DisplayName("Ordena alfabéticamente")
    void alfabetico(){
        ReporteCalificaciones reporteCalificaciones = new ReporteCalificaciones();

        assertThat(reporteCalificaciones.alfabetico(CURSO)).containsExactly(reporte3, reporte2, reporte1);
    }


    @Test
    @DisplayName("Ordena por calificaciones")
    void calificaciones(){
        ReporteCalificaciones reporteCalificaciones = new ReporteCalificaciones();

        assertThat(reporteCalificaciones.calificacion(CURSO)).containsExactly(reporte3, reporte1, reporte2);
    }
}