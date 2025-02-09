public class Student {
    private int numberId;
    private String studentName;
    private static String college = "CS";
    private static int countId = 1;
    private String password;
    private boolean loggedIn;
    private static int minimizePasswordLength = 6;

    public Student( String name, String pass) {
        this.numberId = countId;
        this.studentName = name;
        this.password = pass;
        countId++;
    }

    public boolean logIn(String name, String pass) {
        if(name.equals(this.studentName) && pass.equals(this.password)) {
            this.loggedIn = true;
            return true;
        }
        return false;
    }

    public static String checkPasswordLimitation(Student std) {
        if(minimizePasswordLength > std.password.length()) {
            return "Please Enter Password Greater than " + minimizePasswordLength;
        }
        return std.password;
    }

    public String toString() {
        return "Student{" +
                "numberId=" + numberId +
                ", studentName='" + studentName + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
