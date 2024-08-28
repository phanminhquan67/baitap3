package exercise1;

import java.util.Random;
import java.util.Scanner;

public class excercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            int n = random.nextInt(100) + 1;
            System.out.println("So ngau nhien :");
            if (n % 2 == 0) {
                System.out.println(n + "la so chan");
            } else {
                System.out.println(n + "la so le");
            }
            System.out.println("nhap yes de tiep tuc,nhap khac yes de dung");
            String check = scanner.next();
            if (!check.equalsIgnoreCase("yes"))
            {
                break;
            }
        }
    }
}
