import java.util.Arrays;

public class SelectionInsertionSort {
    public static void main(String[] args) {
        int[] selection = {29, 10, 14, 37, 13};
        for (int i = 0; i < selection.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < selection.length; j++) {
                if (selection[j] < selection[minIndex]) minIndex = j;
            }
            int temp = selection[i];
            selection[i] = selection[minIndex];
            selection[minIndex] = temp;
        }

        int[] insertion = {5, 2, 4, 6, 1, 3};
        for (int i = 1; i < insertion.length; i++) {
            int key = insertion[i];
            int j = i - 1;
            while (j >= 0 && insertion[j] > key) {
                insertion[j + 1] = insertion[j];
                j--;
            }
            insertion[j + 1] = key;
        }

        System.out.println("Selection: " + Arrays.toString(selection));
        System.out.println("Insertion: " + Arrays.toString(insertion));
    }
}
