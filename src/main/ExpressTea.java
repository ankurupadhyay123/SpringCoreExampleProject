package main;

/**
 * Created by ankur on 8/7/17.
 */
public class ExpressTea implements HotDrink{
    //Question 3

    String teaType;

    public String getTeaType() {
        return teaType;
    }

    public void setTeaType(String teaType) {
        this.teaType = teaType;
    }

    @Override
    public void prepareHotDrink() {
        System.out.println("my expresstea");
    }
}
