import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Circle implements Shape{
    private double R;

    public double getR() {
        return R;
    }

    public void setR(float r) {
        R = r;
    }


    @Override
    public double getArea(double r) {
        return (Math.PI * (r * r));
    }

    @Override
    public double getArea(double l, double w) {
        throw new NotImplementedException();
    }
}
