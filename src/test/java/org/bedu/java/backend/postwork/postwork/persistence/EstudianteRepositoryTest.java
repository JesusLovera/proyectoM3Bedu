package org.bedu.java.backend.postwork.postwork.persistence;

import org.bedu.java.backend.postwork.postwork.model.Curso;
import org.bedu.java.backend.postwork.postwork.model.Estudiante;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ComponentScan(basePackages = "org.bedu.java.backed.postwork.postwork")
@ExtendWith(SpringExtension.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EstudianteRepositoryTest {
    @Autowired
    private EstudianteRepository repository;

    @BeforeAll
    void cleanDataBase(){
        repository.deleteAll();
    }

    @Test
    @DisplayName("Estudiante guardado")
    void canSave(){
        Estudiante e=new Estudiante();
        e.setNombre("prueba");
        e=repository.save(e);
        assertNotNull(e.getId());
    }
}