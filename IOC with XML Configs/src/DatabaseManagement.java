
public class DatabaseManagement {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void dbConnection()
    {
        System.out.println("Connected to database with url " + getUrl());
        System.out.println("Connected to database with username " + getUsername());
        System.out.println("Connected to database with password " + getPassword());
    }

    public void dbDispose(){
        System.out.println("Disconnected to database with url " + getUrl());
    }

}
