import java.util.Arrays;

public class Task2B_SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;
        
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));
        
        // Selection sort
        for (int i = 0; i < array.length - 1; i++) {
            counter++;
            int minIndex = i;
            
            // Find minimum in remaining array
            for (int j = i + 1; j < array.length; j++) {
                counter++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap minimum with current position
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
    }
}

