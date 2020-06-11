package Homework1.Task4;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Инициализируйте массив, сразу заполнив его 10-ю рандомными числами по вашему усмотрению
 * Отфильтруйте числа в массиве по следующему принципу:
 *      в list1 числа кратные 2
 *      в list2 числа кратные 3
 *      в list3 все остальные числа
 *
 * Подсказка: для определения кратности(деление без остатка) используйте операнд деления с остатком "%"
 * Например: 4 % 2 = 0; 5 % 2 = 1; 9 % 3 = 0; 11 % 3 = 2;
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        int[] array = {/* массив на 10 чисел */};

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        /* допишите ваш код здесь */

        printList("Числа кратные двум:", list1);
        printList("Числа кратные трем:", list2);
        printList("Остальные числа:", list3);
    }

    public static void printList(String message, ArrayList<Integer> list){
        System.out.print(message);
        for(Integer n: list){
            System.out.print(" " + n);
        }
        System.out.println();
    }

}
