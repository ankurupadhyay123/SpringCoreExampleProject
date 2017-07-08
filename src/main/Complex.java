package main;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ankur on 8/7/17.
 */
public class Complex {

    //Question 5

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    List list;
    Set set;
    Map map;
}
