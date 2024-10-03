public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public void setBaseSalary(int baseSalary) {
        if(baseSalary <= 0) System.out.println("the base Salary should be upper than 0");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
