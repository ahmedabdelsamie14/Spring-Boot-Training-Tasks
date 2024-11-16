public class Circle implements IShape{

    private Draw2D _draw2D;
    private Draw3D _draw3D;

    public Circle(Draw2D _draw2D , Draw3D _draw3D)
    {
        this._draw2D = _draw2D;
        this._draw3D = _draw3D;
    }
    @Override
    public void draw2D() {
        _draw2D.draw("Circle");
    }

    @Override
    public void draw3D() {
        _draw3D.draw("Circle");
    }
}
