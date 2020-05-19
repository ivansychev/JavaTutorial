package Week1.Task3;

/** Переименуйте собаку в Charlie и попросите ее гавкнуть свое имя еще раз (вызвать функцию bark)*/
public class Task3 {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark();

        //ваш код здесь
    }
}

class Dog{
    public String name = "Oscar";

    public void bark(){
        System.out.println("whoof! my name is " + this.name + ", whoof!");
    }
}
