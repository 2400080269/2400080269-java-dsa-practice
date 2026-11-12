public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 30, 8, 21};
        int max = numbers[0];
        int min = numbers[0];

        for (int value : numbers) {
            if (value > max) max = value;
            if (value < min) min = value;
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
