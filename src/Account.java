public class Account {
    private int accountNum;
    private String name;
    private float Amount;

    public void insert(int accountNo, String name, float amount) {
        this.accountNum = accountNo;
        this.name = name;
        this.Amount = amount;
    }

    public void deposit(float amount) {
        this.Amount += amount;
    }

    public  void withdraw(float amount) {
        if (amount > this.Amount) {
            System.out.println("Please Enter Number less than or equal " + this.Amount );
        } else {
            this.Amount -= amount;
        }
    }

    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                ", name='" + name + '\'' +
                ", Amount=" + Amount +
                '}';
    }
}
