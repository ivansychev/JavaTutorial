package Week2.Lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean shouldContinue = true;
        String s;
        int x;

        while (shouldContinue){
            s = bufferedReader.readLine();
            if(s.equals("exit")){
                shouldContinue = false;
            }else {
                try{
                    x = Integer.parseInt(s);
                    if(x > 10){
                        System.out.println(s + " больше 10");
                    }else if(x == 10){
                        System.out.println(s + " равно 10");
                    }else{
                        System.out.println(s + " меньше 10");
                    }
                }catch (Exception e){
                    System.out.println("Пожалуйста введите число!");
                }
            }
        }
    }
}