package Tests;

import figures.Circle;
import org.junit.*;
import org.junit.runners.MethodSorters;

import static java.lang.Math.PI;
import static org.junit.Assert.*;

/**
 * @author  Vladimir
 * @version 25.12.2017
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CircleTest {
    private static final double delta = 0.000001;
    private static Circle circle;

    @BeforeClass
    public static void init(){
        circle = new Circle(1);
    }

    @AfterClass
    public static void tearDown(){
        circle = null;
    }


    @Test
    public void TestGetArea() {
        assertEquals(PI + 0,circle.getArea(), delta);
    }

    /**
     * тест выведет ошибку
     */
    @Test
    public void TestGetWrongArea() {
        assertEquals(PI - 1,circle.getArea(), delta);
    }
}