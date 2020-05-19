package Week1.Task7;

/** Bonus Task */
public class Task7 {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        /** Вопрос:
         * почему я могу создать объект кошки, хотя в классе кошки ничего нет? даже конструктора,
         * который обязательно вызывается при создании объекта и при наследовании класса?
         *
         * Ответ: https://javarush.ru/groups/posts/1391-konstruktorih-klassov-java-jdk-15
         */
    }
}

class Animal{
    Animal(){
        System.out.println("Йа животное");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Йа Собака!");
    }
}

class Cat extends Animal{}
