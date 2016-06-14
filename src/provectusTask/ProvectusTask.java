package provectusTask;

/**
 * Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем,
 * программа должна выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати,
 * то программа должна выводить слово FizzBuzz. Задача может показаться очевидной,
 * но нужно получить наиболее простое и красивое решение.
 * Created by Dim on 14.06.2016.
 */
public class ProvectusTask {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String word = "";

            if (i % 3 == 0) {
                word += "Fizz";
            }
            if (i % 5 == 0) {
                word += "Buzz";
            }

            if (word.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(word);
            }
        }

    }

}