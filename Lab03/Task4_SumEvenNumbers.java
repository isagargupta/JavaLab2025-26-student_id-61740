public class Task4_SumEvenNumbers {
    public static void main(String[] args) {
        int sumSagar = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumSagar += i;
            }
        }
        
        System.out.println("Sum of even numbers from 1 to 100: " + sumSagar);
    }
}

