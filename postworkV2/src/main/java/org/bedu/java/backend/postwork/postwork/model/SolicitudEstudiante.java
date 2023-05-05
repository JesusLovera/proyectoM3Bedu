package org.bedu.java.backend.postwork.postwork.model;

import org.bedu.java.backend.postwork.postwork.model.Curso;
import org.bedu.java.backend.postwork.postwork.model.Estudiante;

import java.util.Random;

public class SolicitudEstudiante { //Esta clase puede formar parte de los modelos
    private Estudiante estudiante;
    private Curso curso;

    public SolicitudEstudiante(Estudiante estudiante, Curso curso) {
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
