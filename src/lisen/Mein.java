package lisen;
import java.util.Scanner;

public class Mein {

    public static void main(String[] args) {
        try  {
            System.out.println("В ведите число от 1-7 это будет день");
        for (int t = 0; t < 3; t++) {
            Scanner scanner = new Scanner(System.in);
            int k = Integer.parseInt(scanner.next());
                String[] Mes = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Субота", "Воскресение"};
                if (1 <= k && k <= 7) {

                    for (int i = k - 1; k - 1 == i; i++) {

                        System.out.println(Mes[i]);
                    }
                } else {
                    System.out.println("Не коректное значение");
                }

            }
        }catch(Exception e) {
            System.out.println("Число не целое");
        }
    }
}
