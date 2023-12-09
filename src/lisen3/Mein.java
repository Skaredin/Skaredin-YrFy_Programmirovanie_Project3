package lisen3;

import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {

        for (int t = 0; t < 2; t++) {

            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);
            int k1 = scanner1.nextInt();
            // ????? Не совсем понятно зачем 2 одинаковых ?
            // Если это всё решается через условие if ?

            if (k >= k1) {
                System.out.println("if: "+k1 + "<" + k);

                for (int i = k; i >= k1; i++) {

                    System.out.println("for: " +k1 + "<" + k);
                    break;
                }
                while (k >= k1)
                {

                    System.out.println("while: "+k1 + "<" + k);
                    break;
                }

            } else if (k <= k1) {

                System.out.println("if : "+k + "<" + k1);
                for (int i = k; i <= k1; i++)
                {
                    System.out.println("for: "+k + "<" + k1);
                    break;
                }
                while (k <= k1)
                {
                    System.out.println("while: "+k + "<" + k1);

                    break;
                }

            }


        }
    }
}