package Homework1.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Допишите код в методе calculateSum, так чтобы этот метод считал сумму всех чисел коллекции и выводил сумму на экран
 */
public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 чисел:");

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        calculateSum(list);
    }

    public static void calculateSum(ArrayList<Integer> list){
        // Допишите код здесь
    }
}
