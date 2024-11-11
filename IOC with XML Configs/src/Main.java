import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args)
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Rectangle r = applicationContext.getBean("rectangle" , Rectangle.class);
        double areaOfRectangle = r.getArea(3,3);
        System.out.println(areaOfRectangle);

        Circle c = applicationContext.getBean("circle" , Circle.class);
        double areaOfCircle = c.getArea(3);
        System.out.println(areaOfCircle);


    }
}