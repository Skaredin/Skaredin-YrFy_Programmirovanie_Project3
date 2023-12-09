package lisen8;
import java.util.Random;
import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int S = scanner.nextInt();
        System.out.println("Массива равен " + S);
        int[] num = new int[S];
        Random randon = new Random();
        int[] min_cou = new int[S];
        int[] min_num = new int[S];

        for (int i = 0; i < num.length; i++) {
            num[i] = randon.nextInt(200);
            System.out.println("Элемент массива " + i + " = " + num[i]);
        }




        int min = num[0];
        for (int o = 0; o < 2; o++) {
            for (int t = 0; t < num.length; t++) {
                if (min >= num[t]) {
                    min_cou[t] = t;
                    min = num[t];
                    min_num[t] = num[t];
                } else {
                    min_cou[t] = 0;
                    min_num[t] = 0;
                }
            }
        }
        for (int k = 0; k < num.length; k++) {
            if (min_num[k] == min && min_cou[k] != 0) {
                System.out.println("Индекс " + min_cou[k] + "\n" + "Мин число -"+ min_num[k] );
            }
        }
    }
}