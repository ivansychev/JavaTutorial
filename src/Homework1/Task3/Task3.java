package Homework1.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Посчитайте длину гипотенузы прямоугольного треугольника по теореме Пифагора.
 *  Можете погуглить вспомогательные функции: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html
 *      Math.pow(double a, double b)
 *      Math.sqrt(double a, double b)
 *
 *      Пасхалка: в классе Math уже есть функция, считающая гипотенузу, можете использовать ее, но советую попробовать сделать через Math.pow и Math.sqrt
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длину 1-ого катета:");
        int n1 = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите длину 2-ого катета:");
        int n2 = Integer.parseInt(bufferedReader.readLine());

        calculateHypotenuse(n1, n2);
    }

    public static void calculateHypotenuse(int n1, int n2){
        // Допишите код здесь
    }
}