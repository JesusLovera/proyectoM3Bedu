package org.bedu.java.backend.postwork.postwork.persistence;

import org.bedu.java.backend.postwork.postwork.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
