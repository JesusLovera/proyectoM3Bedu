package org.bedu.java.backend.postwork.postwork.persistence;

import org.bedu.java.backend.postwork.postwork.model.Materia;
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
class MateriaRepositoryTest {
    @Autowired
    private MateriaRepository repository;

    @BeforeAll
    void cleanDataBase(){
        repository.deleteAll();
    }

    @Test
    @DisplayName("Materia guardado")
    void canSave(){
        Materia m=new Materia();
        m.setNombre("prueba");
        m=repository.save(m);
        assertNotNull(m.getId());
    }

}