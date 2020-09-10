public class PrimeUnder100 {
    public static void main(String[] args) {
        boolean isPrime = false;
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
            }
        }
    }
}
