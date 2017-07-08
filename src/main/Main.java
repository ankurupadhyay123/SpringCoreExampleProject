package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ankur on 29/6/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/spring-config.xml");
        //Question 2
        Database database= (Database) applicationContext.getBean("database");
        System.out.println(database.port);
        System.out.println(database.name);

        //Question 4
        HotDrink tea = (Tea) applicationContext.getBean("tea");
        tea.prepareHotDrink();
        HotDrink expressTea = (ExpressTea) applicationContext.getBean("expresstea");
        expressTea.prepareHotDrink();
        //Question 5
        Complex complex = (Complex)applicationContext.getBean("complexBean");
        System.out.println(complex.getList());
        System.out.println(complex.getMap());
        System.out.println(complex.getSet());

        //Question 6
        Restaurant restaurantByName = (Restaurant)applicationContext.getBean("restaurantByName");
        Restaurant restaurantByConstructor= (Restaurant)applicationContext.getBean("restaurantByConstructor");
        System.out.println(restaurantByName);
        System.out.println(restaurantByConstructor);

        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("resources/spring-autowire.xml");
        Restaurant restaurantByType = (Restaurant)applicationContext2.getBean("restaurantByType");
        System.out.println(restaurantByType);

        //Question 7
        System.out.println(applicationContext.isPrototype("teaRestaurant"));

        ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("resources/spring-teaAnnotations.xml");
        HotDrink tea1 = applicationContext3.getBean(Tea.class);
        tea1.prepareHotDrink();
    }
}
