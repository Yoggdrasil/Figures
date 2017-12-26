package Tests;

import figures.Parallelogram;
import figures.Shape;
import figures.ShapeUtils;
import figures.Triangle;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.PI;
import static org.junit.Assert.assertEquals;

/**
 * @author  Vladimir
 * @version 26.12.2017
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestShapeUtils {
    private static final Triangle      triangle = new Triangle     (4, 3, PI / 2);
    private static final Parallelogram parall   = new Parallelogram(4, 3, PI / 2);
    private List<Shape> list;
    private List<Shape> invList;

    @Before
    public void setUp(){
        list = new LinkedList<>();
        list.add(triangle);
        list.add(parall);

        invList = new LinkedList<>();
        invList.add(parall);
        invList.add(triangle);
        // списки разные
    }

    @After
    public void tearDown(){
        list = null;
        invList = null;
    }

    @Test
    public void testMax(){
        assertEquals(parall, ShapeUtils.max(triangle, parall));
        // вызов подсказки на Alt + Enter
    }

    @Test
    public void testSort() {
        ShapeUtils.sort(invList);
        assertEquals(list, invList);

    }

    @Test
    public void compLists(){
        // проверка, что тест не подтасован
        assertEquals(list, invList);
    }
}
