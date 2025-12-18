import java.util.Arrays;

public class Task2A_FindMinIndex {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        System.out.println("In array:");
        System.out.println(Arrays.toString(array));
        
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        
        System.out.println("The minimum value is on the index: " + minIndex);
    }
}

