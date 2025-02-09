public class Main {

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.insert(4451238, "Ibrahim", 10000);
        acc1.deposit(12000);
        acc1.withdraw(24000);
        System.out.println(acc1.toString());
    }
}