import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Student std1 = new Student( "Ibrahim", "123216126" );
//        Student std2 = new Student( "Mohamed", "126" );
//        System.out.println(std2.logIn("Mohamed", "126"));
//        System.out.println(Student.checkPasswordLimitation(std1));
//        System.out.println(std2.toString());
        //        Department dept = new Department(2, "CS");
//        Employee emp1 = new Employee(1,3000, "Ibrahim", "Gomaa", "Abdullah", "A+", "2255666", "Egyptian", 2000, dept);
//        System.out.println(emp1);

        // abstract

//        HatchBack car1 = new HatchBack();
//        car1.autoPilot();
//        SUV car2 = new SUV();
//        car2.streamingServices();

        // ArrayList
//        ArrayList<Integer> List1 = new ArrayList<>();
//        List1.add(1);
//        List1.add(2);
//        System.out.println(List1);
//        List1.addAll(Arrays.asList(20, 30, 40));
//        System.out.println(List1);
//            // Deprecated
//        // List1.remove(new Integer(20));
//            // Casting
//        List1.remove((Integer) 20);
//        System.out.println(List1);
        Orders order1 = new Orders("Shein", "Ibrahim Gomaa");
        order1.updateStatus(Status.PREPARING);
        System.out.println(Status.PREPARING.ordinal());
        System.out.println(order1.toString());

        Orders order2 = new Orders("AliBaba", "Mohamed Ahmed");
        System.out.println(Status.PENDING.ordinal());
        System.out.println(order2.toString());
    }
}