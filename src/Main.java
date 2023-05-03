import SingleResponsibility.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println("Hesabınızın balansı: " + account.getBalance());
        account.deposit(500);
        System.out.println("Hesabınıza 500 AZN əlavə edildi. Yeni balans: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Hesabınızdan 200 AZN çıxarıldı. Yeni balans: " + account.getBalance());
    }
}