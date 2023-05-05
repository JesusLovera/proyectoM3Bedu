package org.bedu.java.backend.postwork.postwork.model;

import jakarta.persistence.*;

import java.util.Map;
import java.util.Objects;

@Entity
@Table(name="CURSO")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ciclo;
    @ManyToOne
    @JoinColumn(name = "materias_fk", referencedColumnName = "id")
    private Materia materia;

    @ElementCollection
    @CollectionTable(name = "cursos_has_estudiantes", joinColumns = {@JoinColumn(name = "cursos_fk", referencedColumnName = "id")})
    @MapKeyJoinColumn(name = "estudiantes_fk", referencedColumnName = "id")
    @Column(name = "calificacion")
    private Map<Estudiante, Integer> calificaciones;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
    public Map<Estudiante, Integer> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(Map<Estudiante, Integer> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso equipo = (Curso) o;
        return Objects.equals(id, equipo.id) && Objects.equals(ciclo, equipo.ciclo) && Objects.equals(materia, equipo.materia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ciclo);
    }
}


