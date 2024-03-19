package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presavecspring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Imetier metier=context.getBean(Imetier.class);
        System.out.println("RES="+metier.calcul());
    }




}
