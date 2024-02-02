import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanOne.equals(beanTwo));
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.equals(cat2));
    }
}