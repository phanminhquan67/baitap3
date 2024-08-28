package exercise1;

import java.util.Scanner;

public class Excercise3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("Tong cac phan tu : " + sum);
        System.out.println("Gia tri trung binh cua phan tu: " + average);
    }
}
