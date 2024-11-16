public class Rectangle implements IShape{
    public void setDraw3D(Draw3D _draw3D) {
        this._draw3D = _draw3D;
    }

    public void setDraw2D(Draw2D _draw2D) {
        this._draw2D = _draw2D;
    }

    private Draw3D _draw3D;
    private Draw2D _draw2D;


    @Override
    public void draw2D() {
        _draw2D.draw("Rectangle");
    }

    @Override
    public void draw3D() {
        _draw3D.draw("Rectangle");
    }
}
