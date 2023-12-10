package lisen4;

import java.util.Scanner;

public class Mein {

    public static void main(String[] args) {

        for (int p = 0; p < 4; p++) {


            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("В ведите первое число");
            int k = scanner.nextInt();
            System.out.println("В ведите второе число");
            int k1 = scanner1.nextInt();

            int k2 = k + k1;
            int t = 0;
            int t2 = 0;

            if (k2 % 5 == 2) {
                t = k2 % 5;
                System.out.println("Деление на 5 остаток: " + t);

                switch(t)
                {
                    case 1:
                        System.out.println("Switch Деление на 5 остаток: " + t2);
                        break;
                    case 2:
                        System.out.println("Switch Деление на 5 остаток: " + t);
                        break;

                }


            } else if (k2 % 3 == 1) {
                t2 = k2 % 3;

                System.out.println("Деление на 3 остаток: " + t2);

                switch(t2)
                {
                    case 1:
                        System.out.println("Switch Деление на 3 остаток: " + t2);
                        break;
                    case 2:
                        System.out.println("Switch Деление на 3 остаток: " + t);
                        break;
                }
            }else {
                 System.out.println("Остаток = 0");

            }







            System.out.println(k+"+"+k1+"= "+k2);

        }
    }
}

