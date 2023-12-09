package lisen2;

import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.parseInt(scanner.next());
        int i1 = 0;
        int i2 = 1;

        for (int i=0; i<=k; i++ )
        {
            int ro = i2 + i1;

            i1=i2;
            i2=ro;

            System.out.println(i2);

        }System.out.println(i2);
    }
}
