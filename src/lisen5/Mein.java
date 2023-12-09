package lisen5;

import java.util.Scanner;

public class Mein {


    public static void main(String[] args) {

        //for (int t = 0; t < 2; t++) {

            Scanner scanner = new Scanner(System.in);
            int k = scanner.nextInt();

            int[] num= new int[k];
            int b = 0;

            for (int i=0; i<=num.length; i++)
            {
                if (i%5==2)
                {
                    num[b]=i;
                    System.out.println("№ "+b +" масива \n"+"Масив: " +num[b]);
                    b++;
                }else{}

            }


       // }
    }
}
