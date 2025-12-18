import java.util.Arrays;

public class Task1A_BubbleSortSinglePass {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        System.out.println("Before:");
        System.out.println(Arrays.toString(array));
        
        // Single pass - swap if current > next
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        
        System.out.println("After:");
        System.out.println(Arrays.toString(array));
    }
}

