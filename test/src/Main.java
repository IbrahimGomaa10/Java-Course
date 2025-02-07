import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int temp = 15;
//        if (temp > 30) { System.out.println("it's a hot day");}
//        else if (temp <= 30 && temp > 20) {
//            System.out.println("it's a nice day");
//        }
//        else {
//            System.out.println("it's a cold");
//        }
        System.out.print("Please Enter The Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        } else System.out.println("Please Enter Another Number divided by 3, 5 or both");
    }
}