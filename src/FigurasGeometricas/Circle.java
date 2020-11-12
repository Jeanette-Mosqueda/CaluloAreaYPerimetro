package FigurasGeometricas;

public class Circle implements Shape{
    public static final double PI = 3.141592;

    protected double radius;


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiametro() {
        return radius * 2;
    }

    @Override
    public double area() {
        return PI * radius * radius;

    }

    @Override
    public double perimetro() {
        return PI * getDiametro();
    }
}
