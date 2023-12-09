package lisen7;

import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {


        int Si = 10;
        char chars[] = new char[Si];
        char i = 'A';
        char Strs []  = {'A', 'E', 'I', 'O', 'U', 'Y'};



        for (int t = 0; t < chars.length; i++) {

            for (int c = 0; c < Strs.length; c++) {
                if (i == Strs[c]) {
                    i++;

                }
            }
            chars[t] = i;
            System.out.println("Элемент масива "+ t +" "+ chars[t]);
            t++;
        }

    }

}
