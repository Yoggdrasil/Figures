package Tests;

import figures.Triangle;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.PI;
import static org.junit.Assert.*;

public class TriangleTest {
    private double delta = 0.0000001;
    private Triangle triangle;

    @Before
    public void setUp(){
        triangle = new Triangle(4, 3, PI / 2);
    }

    @After
    public void tearDown(){
        triangle = null;
    }

    @Test
    public void TestGetArea() {
        assertEquals(6, triangle.getArea(), delta);
    }
}