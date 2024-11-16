import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Rectangle implements Shape {
    private double l;
    private double w;

    public String shapeName = "Rectangle";

    private final DrawShape drawShape;

    public Rectangle(DrawShape drawShape)
    {
        this.drawShape = drawShape;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public double getArea(double R) {
         throw new NotImplementedException();
    }

    @Override
    public double getArea(double l, double w) {
        return l * w;
    }

    @Override
    public void drawShape() {
        drawShape.draw(this.shapeName);
    }
}
