package assignment4;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so bat ky: ");
        int n = sc.nextInt();

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        System.out.println("Tong cua so la: " + sum);
    }
}
