package harouane.U5W1D1_SpringInt;

import harouane.U5W1D1_SpringInt.Entities.Menu.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);


        Menu menu = (Menu) ctx.getBean("menu");
        menu.print();

        ctx.close();
    }
}
