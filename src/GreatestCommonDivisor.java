import sun.nio.cs.ext.MacHebrew;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.println("Nhập giá trị của a: ");
        a = scanner.nextInt();
        System.out.println("Nhập giá trị của b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung.");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước số chung lớn nhất là: " + a);
    }
}
