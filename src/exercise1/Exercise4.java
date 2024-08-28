package exercise1;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Nhap cac phan tu c:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Sau khi sap xep tang dan:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
