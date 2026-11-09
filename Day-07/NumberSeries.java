public class NumberSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        for (int i = 1; i <= 8; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        int number = 153;
        int temp = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        System.out.println(sum == number ? "Armstrong" : "Not Armstrong");
    }
}
