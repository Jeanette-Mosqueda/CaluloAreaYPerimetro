package FigurasGeometricas;

public class Triangle implements Shape {
    private double sideLength;   // cm
    private double heightLength; // cm

    public Triangle() {
        this.sideLength = sideLength;
        this.heightLength = heightLength;
    }



    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;

    }

    public void setHeightLength(double heightLength){
        this.heightLength= heightLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getHeightLength() {
        return heightLength;
    }
    @Override
    public double area() {
        return (sideLength * heightLength) / 2.0;

    }

    @Override
    public double perimetro() {
        return sideLength * 3.0;
    }


}
