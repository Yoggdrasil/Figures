package figures;

import java.util.Comparator;

/**
 * @author  Vladimir
 * @version 26.12.2017
 */
public abstract class Shape {
    public abstract double getArea();
    public static final Comparator<Shape> AreaComparator = new Comparator<Shape>() {
        // создаю анонимный класс как static поле для класса Shape
        @Override
        public int compare(Shape a, Shape b) {
            if (a.getArea() > b.getArea()) return 1;
            if (a.getArea() < b.getArea()) return -1;
            return 0;
        }
    };
    // методов не создаю
}
