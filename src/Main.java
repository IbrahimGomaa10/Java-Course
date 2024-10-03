import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var employee1 = new Employee();
        employee1.setHourlyRate(2);
        employee1.setBaseSalary(15_000);
        System.out.println(employee1.getBaseSalary());
        System.out.println(employee1.getHourlyRate());
        System.out.println(employee1.calculateWage(10));
    }
}