package org.bedu.java.backend.postwork.postwork.service;

import org.bedu.java.backend.postwork.postwork.model.Curso;

public class PromedioCurso implements Runnable{//Esta clase tambien puede ser un servicio
    private Curso curso;
    private double promedio;

    public PromedioCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public void run() {
        int numAlumnos = 0;
        for(Integer i : curso.getCalificaciones().values()){
            promedio += i;
            numAlumnos++;
        }
        promedio /= numAlumnos;

        System.out.println("Promedio del curso: " + curso.getId() + " " + curso.getMateria().getNombre() + " = " + promedio);
    }
}
