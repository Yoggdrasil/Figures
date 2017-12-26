package figures;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
		Triangle triangle = new Triangle(4, 3, PI / 2);
		Circle circle = new Circle(1);
		Parallelogram parall = new Parallelogram(4, 3, PI / 2);

		System.out.println("Triangle area is " + triangle.getArea());
		System.out.println("Circle area is " + circle.getArea());
		System.out.println("Rectangle area is " + parall.getArea());

		System.out.println(ShapeUtils.max(triangle, parall).getArea());

		List<Shape> src = new LinkedList<Shape>();
		src.add(triangle);
		src.add(parall);

		for(Shape item: src){
			//System.out.println("Area: %.2f	Angle: %f", item.getArea(), item.getAngle());
			// тип коллекции - Shape, поэтому ни один из дочерних методов не работает (запрещен компилятором) e.g. item.getAngle
			System.out.println(item.getArea());
			System.out.println(item.getClass().getName());
		}
    }
}
