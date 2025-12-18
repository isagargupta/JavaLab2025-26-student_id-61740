import java.util.Arrays;

public class Task1C_BubbleSortOptimized1 {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;
        
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));
        
        // Optimized: reduce inner loop by i each pass
        for (int i = 0; i < array.length; i++) {
            counter++;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] > array[j + 1]) {
                    counter++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
    }
}

