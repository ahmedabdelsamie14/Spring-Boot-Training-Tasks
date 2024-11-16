import javax.xml.crypto.Data;
import lombok.Getter;
import lombok.Setter;

public class Product {
    private String productName;
    private double productPrice;
    @Getter
    private int productProcessesNumber = 0;
    private  DatabaseManagement dbManagement;
    public Product(DatabaseManagement _dbManagement)
    {
        dbManagement = _dbManagement;
    }

    public void addProduct()
    {
        System.out.println("Product Added");
        productProcessesNumber++;
    }

    public void changeProduct()
    {
        System.out.println("Product Changed");
        productProcessesNumber++;
    }

    public void deleteProduct()
    {
        System.out.println("Product Deleted");
        productProcessesNumber++;
    }
}
