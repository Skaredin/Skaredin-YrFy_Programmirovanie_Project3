package lisen1;

import java.util.Scanner;

public class Mein {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String k= scanner.nextLine();

        int s = 0;
        int s1 = 1;
        int s2 = 2;
        int s3 = 3;
        int s4 = 4;
        int s5 = 5;
        int s6 = 6;

        String[] Mes = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Субота", "Воскресение"};
        int[] Mes1 = new int[]{0, 1, 2, 3, 4, 5, 6};

        if (k.equals("Понедельник")) {


            for (int i = 0; Mes1[s] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }
        }
        else if (k.equals("Вторник")) {

            for (int i = Mes1[s1]; Mes1[s1] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }

        } else if (k.equals("Среда")) {

            for (int i = Mes1[s2]; Mes1[s2] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }

        }else if (k.equals("Четверг")) {

            for (int i = Mes1[s3]; Mes1[s3] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }

        }else if (k.equals("Пятница")) {

            for (int i = Mes1[s4]; Mes1[s4] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }

        }else if (k.equals("Суббота")) {

            for (int i = Mes1[s5]; Mes1[s5] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }

        }else if (k.equals("Воскресение")) {

            for (int i = Mes1[s6]; Mes1[s6] == i; i++) {

                String Tum = Mes[Mes1[i]];
                int Num = Mes1[i];

                System.out.println(Tum + " :" + Num);
            }

        }else { System.out.println("Введите лубой день (С Понедельник по  Воскресение)");}


    }
}
