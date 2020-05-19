package Week1.Task4;

/** Создайте 3 собаки и присвойте им имена сразу при инициализации объекта (через конструктор)
 * и попросите каждую собаку гавкнуть свое имя (вызвать функцию bark)
 *  */
public class Task4 {
    public static void main(String[] args){
        //ваш код здесь
    }
}

class Dog{
    private String name;

    //ваш код здесь (подсказка: написать конструктор)

    public void bark(){
        System.out.println("whoof! my name is " + this.name + ", whoof!");
    }
}
