import java.util.Scanner;

public class checkInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi: ");
        double money = scanner.nextDouble();
        System.out.println("Nhập số tháng gửi: ");
        int month = scanner.nextInt();
        System.out.println("Nhập tỷ lệ lãi suất");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;

        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng lãi suất là: " + totalInterest);
    }
}
