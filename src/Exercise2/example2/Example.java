package Exercise2.example2;

public class Example {
    public static void main (String[] args){
        Shepherd Shepherd = new Shepherd();
        Shepherd.say(); //Woof woof!
        Shepherd.doCommand(); //Sit!
    }
}

class Dog{
    String command = "dunno any ^^";

    public void say(){
        System.out.println("Bark bark!");
    }
}

class Shepherd extends Dog{

    public void doCommand(){
        System.out.println(this.command);
    }
}