package lisen6;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Mein {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {

        //for (int t = 0; t < 2; t++) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("В ведите любую букву 1");
        String a = scanner.next();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("В ведите любую букву 2");
        String b = scanner1.next();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("В ведите любую букву 3");
        String s = scanner2.next();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("В ведите любую букву 4");
        String d = scanner3.next();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("В ведите любую букву 5");
        String f = scanner4.next();


        if (a != "" || b != "" || s != "" || d != "" || f != "") {

            String[] Masiv = new String[]{"а", "с", "е", "д", "хз", a.toString(), b.toString(), s.toString(), d.toString(), f.toString()};

            for (int t = 0; t <= 9; t++) {


                String sus = Masiv[t];
                System.out.println(ANSI_BLUE + "Попроядку  " + sus );

            }
            System.out.println(" ");

            for (int t2 = 10 - 1; t2>=0; t2--) {


                String sus2 = Masiv[t2];
                System.out.println(ANSI_PURPLE +"В другую сторон " + sus2);
            }


        }
    }
}

