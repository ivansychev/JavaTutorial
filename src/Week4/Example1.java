package Week4;

public class Example1 {
    public static void main(String[] args){
        Cat cat = new Cat();

        Cat.sayName();
    }
}

class Cat{
    static String name = "Barsik";
    int x = 0;

    public static void sayName(){
        System.out.println(name);
    }
}