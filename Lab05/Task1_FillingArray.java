public class Task1_FillingArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        
        // Classic for loop to fill array with 9 to 0
        for (int i = 0; i < array.length; i++) {
            array[i] = 9 - i;
        }
        
        // For-each loop to display values
        System.out.println("Array values:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

