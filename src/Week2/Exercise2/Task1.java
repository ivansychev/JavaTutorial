package Week2.Exercise2;

/**
 * 1. Наследуйте Собаку от Питомца, а Питомца от Животного.
 * 2. Допишите метод bark(), чтобы он выводил в консоль следующее:
 *
 * Hi, my name is: Bobik
 * I have: 4 paws!
 * I am very: human-friendly!
 *
 */

public class Task1 {
    public static void main(String[] args){
        Dog dog = new Dog("Bobik");
        dog.bark();
    }
}

class Animal{
    int paws = 4;
}

class Pet{
    String behaviour = "human-friendly!";
}

class Dog{
    public String name;

    Dog(String name){
        this.name = name;
    }

    public void bark(){
        System.out.println("Hi, my name is: " + this.name);
        System.out.println("I have: " + "paws!");
        System.out.println("I am very: ");
    }
}
