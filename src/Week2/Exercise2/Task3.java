package Week2.Exercise2;

/**
 * Продолжаем играть в RGP. Представьте что вы начали игру за Лучника(Archer). Лучник использует стрелы(arrows) и стреляет на диснатцию(range) = 1;
 * 1. Расскоментируйте код и прокачайте своего лучника сначала в Воина с английским длинным луком(Longbowman), а потом в Арбалетчика(Crossbowman) используя наследование.
 * 2. Переопределите метод shoot() - стрелять, так чтобы:
 *    - Longbowman стрелял стрелами на дистанцию = 2;
 *    - Crossbowman стрелял дротиками(bolts) на дистанцию = 2
 */

public class Task3 {
    public static void main(String[] args){
        Archer archer = new Archer();
        archer.shoot();

        Longbowman longbowman = new Longbowman();
        // longbowman.shoot();

        Crossbowman crossbowman = new Crossbowman();
        // crossbowman.shoot();
    }
}

class Archer{
    public String unit = "Archer";
    public String ammo = "arrows";
    public int range = 1;

    public void shoot(){
        System.out.println(this.unit + " shoots " + this.ammo + " within range: " + this.range);
    }
}

class Longbowman{
    private String unit = "Longbowman";
    int range = 2;
}

class Crossbowman{
    private String unit = "Crossbowman";
    String ammo = "bolts";
}