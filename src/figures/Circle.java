package figures;

import static java.lang.Math.*;


/**
 * @author  Vladimir
 * @version 25.12.2017
 */
public class Circle extends Shape {
    private double radius;
    private double area;

    /**
     * @param a радиус круга
     */
    public Circle(double a){
        this.radius = a;
        this.area = PI * pow(this.radius, 2);
    }

    @Override
    public double getArea(){
        return this.area;
    }
}
