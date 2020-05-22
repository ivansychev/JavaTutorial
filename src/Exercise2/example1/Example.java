package Exercise2.example1;

public class Example{
    public static void main (String[] args){
        Dog dog = new Dog();
        dog.say();
    }
}

class Animal{

}

class Mammal{
    int limbs = 4;
}

class Pet{
    String behaviour = "domestic";
}

class Dog{
    public void say(){
        System.out.println("I am a dog!");
        System.out.println("I have " + this.limbs + " limbs!");
        System.out.println("I am " + this.behaviour + " animal!");
    }
}