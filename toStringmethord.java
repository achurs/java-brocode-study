/**
 * toStringmethord
 */
public class toStringmethord {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
    }
}

class Car {
    int year=2019;
    String color = "White";
    Car(){
        System.out.println("Starting");
    }
    public String toString(){
        return year+" "+color;
    }
}