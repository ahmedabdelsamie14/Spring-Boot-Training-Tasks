import lombok.Setter;

public class Plane implements IVehicle{
    @Setter
    private DatabaseOperation dbOperation;

    @Override
    public void save() {
        dbOperation.save();
    }
}
