package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by ankur on 8/7/17.
 */
public class Restaurant {
    //Question 3
    HotDrink hotDrink;

    //Question 9 autowire to field
    @Autowired
    Tea tea;

    public Tea getTea() {
        return tea;
    }

    //Question 9 autowire to setter
    @Autowired
    public void setTea(Tea tea) {
        this.tea = tea;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    Integer number;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    //Question 9 autowire to constructor
    @Autowired
    public Restaurant(Tea tea) {
        this.tea = tea;
    }

    //Question 8
    @Required
    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public Restaurant() {
        System.out.println("constructor called");
    }

    public String toString(){
        return " "+hotDrink+" "+number;
    }
}
