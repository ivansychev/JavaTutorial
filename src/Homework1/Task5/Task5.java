package Homework1.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Найти число Фибоначчи по индексу
 */
public class Task5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите индекс:");

        byte index = Byte.parseByte(bufferedReader.readLine());

        findFibonacciNumber(index);
    }

    public static void findFibonacciNumber(byte index){
        // допишите код здесь
    }
}
