package Week2.Exercise2;

/**
 * Представьте, что вы играете в RPG игру. Вы начали играть за Воина, у которого здоровье = 100, и оружие = топор.
 * После нескольких часов игры вы набрали достаточно XP, и ваш Воин стал Рыцарем.
 *
 * У рыцаря здоровье = 150, оружие = меч. Рыцарь атакует мечом, и получает меньще урона от врагов.
 * Допишите методы: attack() - атаковать и gotHit() - получить урон в класс рыцарь.
 *
 * (Подсказка): Нужно переопределить метод attack и gotHit в родительском классе.
 */

public class Task2 {
    public static void main(String[] args){
        Warrior warrior = new Warrior();
        warrior.attack();
        warrior.gotHit(20);

        System.out.println("-----------");

        Knight knight = new Knight();
        knight.attack();
        knight.gotHit(10);
    }
}

class Warrior{
    int HP = 100;
    String weapon = "axe";

    public void attack(){
        System.out.println("Warrior attacks enemies with its " + this.weapon + ".");
    }

    public void gotHit(int hp){
        System.out.println("Warrior is being attacked! Warrior loses " + hp + "HP!");
        this.HP -= hp;
        System.out.println("Warriors health: " + this.HP);
    }
}

class Knight extends Warrior{
    int HP = 150;
    String weapon = "sword";
}
