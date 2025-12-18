import java.util.Arrays;

public class Task1D_BubbleSortOptimized2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Already sorted - best case
        int counter = 0;
        
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));
        
        boolean swapped = true;
        
        for (int i = 0; i < array.length && swapped; i++) {
            counter++;
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
        }
        
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
    }
}

