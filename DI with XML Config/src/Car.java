import javax.xml.crypto.Data;

public class Car implements IVehicle{

    private DatabaseOperation _dbOperation;

    public Car(DatabaseOperation _dbOperation)
    {
        this._dbOperation = _dbOperation;
    }

    @Override
    public void save() {
        _dbOperation.save();
    }
}
