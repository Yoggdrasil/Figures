package Tests;

import figures.Parallelogram;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static java.lang.Math.PI;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParallelogramTest {
    private double delta = 0.0000001;
    private Parallelogram parall;

    @Before
    public void init(){
        parall = new Parallelogram(4, 3, PI / 2);
    }

    @After
    public void tearDown(){
        parall = null;
    }

    @Test
    public void TestGetArea() {
        assertEquals(12, parall.getArea(), delta);
    }
}