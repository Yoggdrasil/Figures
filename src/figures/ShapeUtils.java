package figures;

import java.util.Collections;
import java.util.List;

/**
 * @author  Vladimir
 * @version 26.12.2017
 */
public class ShapeUtils {

    public static Shape max(Shape a, Shape b){
        return a.getArea() > b.getArea() ? a : b;
    }

    public static void sort (List<Shape> shapes){
        Collections.sort(shapes, Shape.AreaComparator);
    }

}
