public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {11, 24, 7, 35, 18};
        int target = 35;
        int answer = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                answer = i;
                break;
            }
        }

        System.out.println("Index: " + answer);
    }
}
