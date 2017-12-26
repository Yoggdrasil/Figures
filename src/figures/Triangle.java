package figures;

import static java.lang.Math.sin;


/**
 * @author  Vladimir
 * @version 25.12.2017
 */
public class Triangle extends Shape {
    private double a;
    private double b;
    private double angle;
    private double area;

    /**
     * @param a      одна сторона треугольника
     * @param b      другая сторона треугольника
     * @param angle  угол между ними
     */
    public Triangle(double a, double b, double angle){
        this.a = a;
        this.b = b;
        this.angle = angle;
        this.area = this.a * this.b * sin(this.angle) / 2;
    }

    @Override
    public double getArea(){
        return this.area;
    }

    public double getAngle() {
        return angle;
    }
}
