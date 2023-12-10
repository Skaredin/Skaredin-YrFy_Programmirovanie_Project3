package lisen2;

import java.util.Scanner;

public class Mein {
    public static final String ANSI2 = "\u001B[33m";
    public static final String ANSI = "\u001B[96m";
    public static void main(String[] args) {
        System.out.println( "Сколько раз зделать Фибеначи");
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.next());
        int i1 = 0;
        int i2 = 1;

        for (int i=1; i<=k; i++ )
        {
            int ro = i2 + i1;

            i1=i2;
            i2=ro;

            System.out.println(ANSI + "№" +i + ANSI2+ "  Число Фибеначи "+i2);

        }
    }
}
