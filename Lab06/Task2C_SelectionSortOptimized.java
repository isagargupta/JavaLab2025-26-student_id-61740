import java.util.Arrays;

public class Task2C_SelectionSortOptimized {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int counter = 0;
        
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));
        
        // Optimized selection sort - find min and max simultaneously
        int left = 0;
        int right = array.length - 1;
        
        while (left < right) {
            counter++;
            int minIndex = left;
            int maxIndex = left;
            
            for (int j = left; j <= right; j++) {
                counter++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            
            // Swap minimum to left
            int temp = array[minIndex];
            array[minIndex] = array[left];
            array[left] = temp;
            
            // If max was at left, it's now at minIndex
            if (maxIndex == left) {
                maxIndex = minIndex;
            }
            
            // Swap maximum to right
            temp = array[maxIndex];
            array[maxIndex] = array[right];
            array[right] = temp;
            
            left++;
            right--;
        }
        
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of actions: " + counter);
    }
}

