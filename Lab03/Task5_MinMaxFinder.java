public class Task5_MinMaxFinder {
    public static void main(String[] args) {
        int minSagar = Integer.MAX_VALUE;
        int maxSagar = Integer.MIN_VALUE;
        int countSagar = 0;
        
        System.out.println("Randomly drawn numbers:");
        
        while (countSagar < 10) {
            int randomNumberSagar = (int) (Math.random() * 100) + 1;
            System.out.println("Number " + (countSagar + 1) + ": " + randomNumberSagar);
            
            if (randomNumberSagar < minSagar) {
                minSagar = randomNumberSagar;
            }
            if (randomNumberSagar > maxSagar) {
                maxSagar = randomNumberSagar;
            }
            
            countSagar++;
        }
        
        System.out.println("\nSmallest number: " + minSagar);
        System.out.println("Largest number: " + maxSagar);
    }
}

