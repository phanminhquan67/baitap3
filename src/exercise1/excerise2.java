package exercise1;

import java.util.Scanner;

public class excerise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phan tu " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Gia tri lon nhat trong mang la: " + max);
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
