package FigurasGeometricas;

public class Square implements Shape{
    protected double sideLength;

    public Square() {
        this.sideLength = sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public double area() {

        return sideLength * sideLength;
    }

    @Override
    public double perimetro() {
        return sideLength * 4;
    }
}
