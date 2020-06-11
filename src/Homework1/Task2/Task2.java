package Homework1.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/** Допишите код в методе calculateSum, так чтобы этот метод считал производное(умножение) всех чисел коллекции и выводил результат на экран
 * Также добавьте перехват исключения в случае если пользователь введет не число, а что-то другое
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 5 чисел:");

        ArrayList<Integer> list = new ArrayList<>();

        calculateProduct(list);
    }

    public static void calculateProduct(ArrayList<Integer> list){
        // Допишите код здесь
    }
}
