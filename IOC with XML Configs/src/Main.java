import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

//        Rectangle r = applicationContext.getBean("rectangle" , Rectangle.class);
//        r.drawShape();
//
//        Circle c = applicationContext.getBean("circle" , Circle.class);
//        c.drawShape();
//        Rectangle r = applicationContext.getBean("rectangle" , Rectangle.class);
//        double areaOfRectangle = r.getArea(3,3);
//        System.out.println(areaOfRectangle);
//        System.out.println(r.hashCode());
//
//        Rectangle r2 = applicationContext.getBean("rectangle" , Rectangle.class);
//        double areaOfRectangle2 = r2.getArea(3 , 4);
//        System.out.println(areaOfRectangle2);
//        System.out.println(r2.hashCode());
//
//        Circle c = applicationContext.getBean("circle" , Circle.class);
//        double areaOfCircle = c.getArea(3);
//        System.out.println(areaOfCircle);

        Product P1 = applicationContext.getBean("product" , Product.class);

        P1.addProduct();
        P1.changeProduct();
        P1.deleteProduct();
        System.out.println(P1.getProductProcessesNumber());

        Product P2 = applicationContext.getBean("product" , Product.class);
        P2.addProduct();

        System.out.println(P2.getProductProcessesNumber());

        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}