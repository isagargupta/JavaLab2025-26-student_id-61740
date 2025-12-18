public class Task2_MinMaxArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        
        // Fill array with random numbers 1-100
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        // Find min and max
        int min = array[0];
        int max = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        
        System.out.println("Smallest element: " + min);
        System.out.println("Largest element: " + max);
    }
}

