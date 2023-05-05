package org.bedu.java.backend.postwork.postwork.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="MATERIA")
public class Materia {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String nombre;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }
        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Materia equipo = (Materia) o;
                return Objects.equals(id, equipo.id) && Objects.equals(nombre, equipo.nombre);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, nombre);
        }
}
