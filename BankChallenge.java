public class BankChallenge {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Account account2 = new Account(1000);

        System.out.println(account.getBalance());
        account.withdraw(100);
        System.out.println(account.getBalance());
        account.withdraw(1000);
        System.out.println(account.getBalance());
        account.deposit(-100);
        System.out.println(account.getBalance());
        account.withdraw(900);
        System.out.println(account.getBalance());

        account.deposit(1000);

        account.transfer(account2, 1200);

        System.out.println(account.getBalance());
        System.out.println(account2.getBalance());
    }
}