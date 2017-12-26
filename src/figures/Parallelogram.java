package figures;

import static java.lang.Math.sin;

/**
 * @author  Vladimir
 * @version 25.12.2017
 */
public class Parallelogram extends Shape {
    private double a;
    private double b;
    private double angle;
    private double area;

    /**
     * @param a      одна сторона параллелограмма
     * @param b      другая сторона параллелограмма
     * @param angle  угол между ними
     */
    public Parallelogram(double a, double b, double angle){
        this.a = a;
        this.b = b;
        this.angle = angle;
        this.area = a * b * sin(angle);
    }

    @Override
    public double getArea(){
        return this.area;
    }
}
