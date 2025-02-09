public class Main {

    public static void main(String[] args) {
        Student std1 = new Student( "Ibrahim", "123216126" );
        Student std2 = new Student( "Mohamed", "126" );
        System.out.println(std2.logIn("Mohamed", "126"));
        System.out.println(Student.checkPasswordLimitation(std1));
        System.out.println(std2.toString());
    }
}