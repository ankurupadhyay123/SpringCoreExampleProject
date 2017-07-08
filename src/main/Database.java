package main;

/**
 * Created by ankur on 8/7/17.
 */
public class Database {

    //Question 1
    Integer port;
    String name;

    public Integer getPort() { return port; }

    public void setPort(Integer port) { this.port = port; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return port+" "+name;
    }
}
