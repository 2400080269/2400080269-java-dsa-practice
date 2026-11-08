public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = number > 1;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not prime");
    }
}
