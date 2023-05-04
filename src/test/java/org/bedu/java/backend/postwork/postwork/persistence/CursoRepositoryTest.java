package org.bedu.java.backend.postwork.postwork.persistence;

import org.bedu.java.backend.postwork.postwork.model.Curso;
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
class CursoRepositoryTest {
    @Autowired
    private CursoRepository repository;

    @BeforeAll
    void cleanDataBase(){
        repository.deleteAll();
    }

    @Test
    @DisplayName("Curso guardado")
    void canSave(){
        Curso c=new Curso();
        c.setCiclo("prueba");
        c=repository.save(c);
        assertNotNull(c.getId());
    }
}