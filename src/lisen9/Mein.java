package lisen9;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Mein {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int S = scanner.nextInt();
        int[] num = new int[S];
        Random randon = new Random();


            for (int i = 0; i < num.length; i++) {

                num[i] = randon.nextInt(200);
                if (num[i] != 0) {

                    Arrays.sort(num);
                    for (int values : num) {
                        System.out.println("Элемент массива " + i + " = " + num[i]);
                        break;
                    }
                }

            }







    }
}
