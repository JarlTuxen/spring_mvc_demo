package dk.kea.dat20v2.spring_mvc_demo.Service;

import dk.kea.dat20v2.spring_mvc_demo.Model.Animal;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//fortæl Spring at der skal laves dependency injection
@SpringBootTest
class AnimalServiceTest {

    /* constructor injection
    AnimalRepository animalRepository = new AnimalRepository();
    AnimalService animalService = new Animalservice(animalRepository);
    */

    @Autowired
    AnimalService animalService;

    //arrange

    @BeforeAll
    public static void initialize(){
        //rutine der køres en gang før alle tests - f.eks. opret db connection
    }

    @BeforeEach
    void setUp(){
        //rutine der køres før hver test
    }

    @AfterEach
    void tearDown(){
        //cleanup efter hver test
    }

    @AfterAll
    public static void closeDown(){
        //ryd op efter alle tests er kørt - f.eks. luk db connection
    }

    @Test
    void readAll() {
        //Act
        List<Animal> animalList;
        //læs fra service
        animalList = animalService.readAll();
        long antal = animalList.size();

        //Assert
        //db initialiseret med 4 dyr, så der skal returneres 4
        assertEquals(4, antal);
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