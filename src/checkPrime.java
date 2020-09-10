import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra: ");
        int number = scanner.nextInt();
        boolean isPrime = false;

        if (number < 2){
            isPrime = false;
        }
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0 ){
                isPrime = false;
            }
            else
                isPrime = true;
        }
        if (isPrime) {
            System.out.println("Đây là số nguyên tố");
        }
        else
            System.out.println("Đây không là số nguyên tố");
    }
}
