package Week2.Exercise2.BonusTask;

/**
 * Задание такое-же что и в Week2.Exercise2.Task3, НО:
 *
 * Обратите внимание, что теперь наши переменные стали private и мы используем геттеры: getUnit(), getAmmo(), getRange()
 * Сделайте так, чтобы Longbowman и Crossbowman стреляли так же как и в предыдущей задачке.
 *
 *  ПЕРЕОПРЕДЕЛЯТЬ МЕТОД shoot НЕЛЬЗЯ!!!!
 *
 *  (подсказка): помнить правило:
 *  Набор методов, которые можно вызвать у переменной, определяется типом переменной.
 *  А какой именно метод/какая реализация вызовется, определяется типом/классом объекта, ссылку на который хранит переменная.
 *
 */


public class Task3 {
    public static void main(String[] args){
        Archer archer = new Archer();
        archer.shoot();

        Longbowman longbowman = new Longbowman();
        longbowman.shoot();

        Crossbowman crossbowman = new Crossbowman();
        crossbowman.shoot();
    }
}

class Archer{
    private String unit = "Archer";
    private String ammo = "arrows";
    private int range = 1;

    public String getUnit() {
        return unit;
    }

    public String getAmmo() {
        return ammo;
    }

    public int getRange() {
        return range;
    }

    // не переопределять!!!!
    public void shoot(){
        System.out.println(this.getUnit() + " shoots " + this.getAmmo() + " within range: " + this.getRange());
    }
}

class Longbowman extends Archer{
    private String unit = "Longbowman";
    private int range = 2;
}

class Crossbowman extends Longbowman{
    private String unit = "Crossbowman";
    private String ammo = "bolts";
}