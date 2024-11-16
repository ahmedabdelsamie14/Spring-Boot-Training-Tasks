import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");


        //Task One
        Circle C1 = container.getBean("circle" , Circle.class);

        C1.draw2D();
        C1.draw3D();


        Rectangle R1 =  container.getBean("rectangle" , Rectangle.class);

        R1.draw2D();
        R1.draw3D();


        //Task Two

        Plane P1 = container.getBean("plane" , Plane.class);

        P1.save();

        Car CR1 = container.getBean("car" , Car.class);

        CR1.save();
    }
}