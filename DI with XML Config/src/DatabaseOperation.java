import lombok.Getter;
import lombok.Setter;

public class DatabaseOperation {

    @Getter @Setter
    private String url;

    @Getter @Setter
    private String username;

    @Getter @Setter
    private String password;
    public void save()
    {
        System.out.println("Saved In Database");
    }

    public void connectedDB()
    {
        System.out.println("Connected with DB it's URL : " + getUrl());
        System.out.println("Connected with DB it's Username : " + getUsername());
        System.out.println("Connected with DB it's Password : " + getPassword());
    }
}
