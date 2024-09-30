import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int x = 1;
//        int y = x++;
//        System.out.println(x);
//        System.out.println(y);
        ///
//        int x = 1;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);
        ///
//        int number =  (int)Math.round(Math.random() * 100);
//        System.out.println(number);
        ///

        // mortgage

        final int Percent = 100;
        final int year_to_month = 12;
        int principal = 0;
        float monthly_rate = 1;
        int monthly_period = 1;
        Scanner scanner = new Scanner(System.in);
        // principle
        while (true) {
            System.out.print("Please Enter The principal: ");
             principal = scanner.nextInt();
            if(principal >= 1000 && principal <= 1_000_000) {
                break;
            } else System.out.println("Please Enter The Number Between 1K to 1M");
        }
        // annual rate

        while(true) {
            System.out.print("Please Enter Annual interest Rate: ");
            float annualRate = scanner.nextFloat();
             monthly_rate = annualRate / Percent / year_to_month;
            if(monthly_rate > 0 && monthly_rate <= 30) {
                break;
            } else System.out.println("Please Enter The Number Between 1 to 30");
        }

        // period (months)
        while (true) {
            System.out.print("Please Enter Period: ");
            byte period = scanner.nextByte();
            if(period > 0 && period <= 30) {
                monthly_period = period * year_to_month;
                break;
            } else System.out.println("Please Enter The Number Between 1 to 30");
        }

        scanner.close();

        // result
        double mortgage = principal*(monthly_rate * Math.pow(1 + monthly_rate, monthly_period))/(Math.pow(1 + monthly_rate, monthly_period) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage is: " + mortgageFormatted);

        //////////////////////////////

//        System.out.print("Please Enter The role: ");
//        Scanner scan = new Scanner(System.in);
//        String role_input = scan.next();
//        switch(role_input.toLowerCase()){
//            case "admin":
//                System.out.println("He is an Admin");
//                break;
//            case "manager":
//                System.out.println("He is a manager");
//                break;
//             default:
//                System.out.println("That is a guest");
//        }
//        System.out.print("Please Enter The Number: ");
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        if(number % 5 == 0 && number % 3 == 0) {
//            System.out.println("Fizz Buzz");
//        } else if (number % 3 == 0) {
//            System.out.println("Fizz");
//        } else if (number % 5 == 0) {
//            System.out.println("Buzz");
//        } else System.out.println(number);
        ////
//        int i = 1;
//        while (i <= 5) {
//            System.out.println("Hello " + i );
//            i++;
//        }
//        int i = 1;
//        do {
//            System.out.println("Hello " + i );
//            i++;
//        } while(i <= 5);

    }
}