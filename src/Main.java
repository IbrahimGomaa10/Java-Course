import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static int Percent = 100;
    final static int year_to_month = 12;

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

        int principal = 0;
        float annualRate = 0;
        byte period = 0;


        // principal
        principal = (int)(readData("Please Enter The principal: ", 1000, 1_000_000));
//        while (true) {
//            System.out.print("Please Enter The principal: ");
//             principal = scanner.nextInt();
//            if(principal >= 1000 && principal <= 1_000_000) {
//                break;
//            } else System.out.println("Please Enter The Number Between 1K to 1M");
//        }

        // annual rate
         annualRate = (float) readData("Please Enter Annual interest Rate: ", 1, 30);
//        while(true) {
//            System.out.print("Please Enter Annual interest Rate: ");
//             annualRate = scanner.nextFloat();
//            if(annualRate > 0 && annualRate <= 30) break;
//             else System.out.println("Please Enter The Number Between 1 to 30");
//        }

        // period (months)
        period = (byte) readData("Please Enter Period: ", 1, 30);
//        while (true) {
//            System.out.print("Please Enter Period: ");
//             period = scanner.nextByte();
//            if(period > 0 && period <= 30) break;
//             else System.out.println("Please Enter The Number Between 1 to 30");
//        }

        // result of mortage
        double mortgage = calculateMortgage(principal, annualRate, period);

        // turn currency
        printMortgage(mortgage);
        /////
        // get balance every month
        printBalance(period, principal, annualRate);

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

    private static void printMortgage(double mortgage) {
        System.out.println();
        System.out.println("Mortgage");
        System.out.println("---------------");
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage is: " + mortgageFormatted);
    }

    private static void printBalance(byte period, int principal, float annualRate) {
        System.out.println();
        System.out.println("Balanace");
        for(short months = 1; months <= period * year_to_month; months++) {
            double balance = calculateBalance(principal, annualRate, period, months);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readData(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(message);
            value = scanner.nextFloat();
            if(value >= min && value <= max) {
                break;
            } else System.out.println("Please Enter The Number Between " + min + " to " + max);
        }
        return value;

    }

    public static double calculateBalance(int principal, float annualRate, byte period, short numberOfPayment) {
        float monthly_rate = annualRate / Percent / year_to_month;
        float monthly_period = period * year_to_month;
        double balance = principal *
                (Math.pow(1 + monthly_rate, monthly_period) - Math.pow(1 + monthly_rate, numberOfPayment))
                / (Math.pow(1 + monthly_rate, monthly_period) - 1);
        return balance;
    }

    public static double calculateMortgage(int principal, float annualRate, byte period) {
        float monthly_rate = annualRate / Percent / year_to_month;
        int monthly_period = period * year_to_month;
        double mortgage = principal*(monthly_rate * Math.pow(1 + monthly_rate, monthly_period))/(Math.pow(1 + monthly_rate, monthly_period) - 1);
        return mortgage;
    }
}