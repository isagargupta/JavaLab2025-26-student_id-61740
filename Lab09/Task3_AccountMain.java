public class Task3_AccountMain {
    public static void main(String[] args) {
        Account account = new Account("John Doe", 1000, "ACC123456");
        
        try {
            System.out.println("Attempting transfer of 1500...");
            account.transfer(1500); // Will throw exception (balance is 1000)
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other exception: " + e.getMessage());
        } finally {
            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}

