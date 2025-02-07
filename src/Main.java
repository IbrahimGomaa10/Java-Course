import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static int MONTHS_IN_YEAR = 12;
    final static int PERCENT = 100;

    public static void main(String[] args) {

        // Global Input
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        Scanner scanner = new Scanner(System.in);
        // Variable
        double Principal = 0;
        float annualRate = 0;
        int years = 0;



        // Principal
        Principal = (double)readValue("Please Enter The Principal: ", 1000, 3_000_000);

        // before refactor
//        while(true) {
//            System.out.print("Please Enter The Principal: ");
//            Principal = scanner.nextDouble();
//            if (Principal >= 1_000 && Principal <= 3_000_000) {
//                break;
//            }
//        }
        // Annual Rate
        annualRate = (float) readValue("Please Enter The Annual Rate: ", 1, 30);

        //before refactor
//        while(true) {
//            System.out.print("Please Enter The Annual Rate: ");
//            annualRate = scanner.nextFloat();
//            if (annualRate >= 1 && annualRate <= 30) {
//                break;
//            }
//        }

        // years of loan term
        years = readValue("Please Enter The loan Term Rate: ", 1, 30);
        // before refactor
//        while (true) {
//            System.out.print("Please Enter The loan Term Rate: ");
//            years = scanner.nextInt();
//            if(years >= 1 && years <= 30) {
//                break;
//            }
//        }
        // mortgage method
        double mortgage = calculateMortgage(Principal, annualRate, years);

        System.out.println(currency.format(mortgage));

    }

    public static int readValue(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int value;
        while (true) {
            System.out.print(message);
            value = scanner.nextInt();
            if(value >= min && value <= max)
                break;
        }
        return value;
    }

    public static double calculateMortgage(double Principal, float annualRate, int years) {
        float monthlyRate = annualRate / PERCENT/ MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;
        double mortgage = Principal * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments) / (Math.pow( 1 + monthlyRate, numberOfPayments) - 1));
        return mortgage;
    }


}