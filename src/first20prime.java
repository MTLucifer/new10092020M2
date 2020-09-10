public class first20prime {
    public static void main(String[] args) {
        boolean isPrime = false;
        int number = 0;
        System.out.print("2\n3\n");
        for (int i = 2; i < 100 ; i++) {

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    isPrime = false;
                 else
                    isPrime = true;
            }
            if (isPrime) {
                System.out.println(i);
                number += 1;
            }
            if (number == 18)
                break;
        }
    }
}
