package Homework1.Task6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Введи с клавиатуры 10 слов, скомируйте их в список строк list.
 *
 * 2. Метод doubleValues должен удваивать слова в списке по принципу:
 * "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
 *
 * 3. Выведи результат удвоенного списка на экран.
 */

public class Task6 {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        System.out.println(doubleValues(list));
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        return null;
    }
}
