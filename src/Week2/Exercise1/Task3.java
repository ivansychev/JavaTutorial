package Week2.Exercise1;

/**
 * 1. Расскоментируйте код.
 * 2. Создайте попугая с именем "Кеша", не вызывая конструктор вида Bird(String name)
 * (Пояснение): Bird bird2 = new Bird("Кеша"); - неправильный ответ!
 * (Подсказка): Дописать код ТОЛЬКО на строке 13!!
 */

public class Task3 {
    public static void main(String[] args){
        Bird bird1 = new Bird("Гоша");
        // Bird bird2 =

        System.out.println(bird1.name);
        // System.out.println(bird2.name);
    }
}

class Bird{
    public String name;

    public Bird(){
        this("Кеша");
    }

    public Bird(String name){
        this.name = name;
    }
}

