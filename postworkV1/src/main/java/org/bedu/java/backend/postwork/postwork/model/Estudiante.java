package org.bedu.java.backend.postwork.postwork.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="ESTUDIANTE")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombreCompleto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante equipo = (Estudiante) o;
        return Objects.equals(id, equipo.id) && Objects.equals(nombreCompleto, equipo.nombreCompleto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreCompleto);
    }
}

