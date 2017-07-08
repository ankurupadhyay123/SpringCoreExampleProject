package main;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/**
 * Created by ankur on 8/7/17.
 */
//Question 10
//@Component
 //   @Controller
    @Repository
public class Tea implements HotDrink {
    //Question 3

    public ExpressTea getExpressTea() {
        return expressTea;
    }

    public void setExpressTea(ExpressTea expressTea) {
        this.expressTea = expressTea;
    }

    ExpressTea expressTea;

    @Override
    public void prepareHotDrink() {
        System.out.println("my tea");
    }
}
