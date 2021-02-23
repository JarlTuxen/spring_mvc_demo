package dk.kea.dat20v2.spring_mvc_demo.Service;

import dk.kea.dat20v2.spring_mvc_demo.Model.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnimalServiceTest {
    @Autowired
    AnimalService animalService;

    @BeforeEach
    void SetUp(){
        //Arrange
        //animalService = new AnimalService();
    }

    @Test
    void readAll() {
        //Act
        List<Animal> animalList;
        //læs fra service
        animalList = animalService.readAll();
        long antal = animalList.size();

        //Assert
        assertEquals(antal, 4);
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void read() {
    }

    @Test
    void delete() {
    }
}