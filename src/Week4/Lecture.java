package Week4;

public class Lecture {
    public static void main(String[] args){

        Car.Door door = new Car.Door();

        System.out.println(door.getDoorHeigh());

        /*Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car3.topSpeed = 300;

        car1.reachTopSpeed();
        car2.reachTopSpeed();
        car3.reachTopSpeed();*/

        /*System.out.println(Car.manufacturer);*/


        /*car1.manufacturer = "Hundai";
        System.out.println(car1.manufacturer);
        System.out.println(car2.manufacturer);
        System.out.println(car3.manufacturer);*/
    }
}

class Car{
    int wheels = 4;
    int doors = 4;
    int topSpeed = 200;

    static int height = 160;

    static String manufacturer = "BMW";

    public void reachTopSpeed(){
        System.out.println("Reached: " + this.topSpeed + "km/h");
    }

    public static void changeManufacturer(String name){
        manufacturer = name;
    }

    public static class Door{
        int z = 10;

        public int getDoorHeigh(){
            return height;
        }
    }
}