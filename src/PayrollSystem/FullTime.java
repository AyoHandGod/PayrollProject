package PayrollSystem;

/**
 *
 * @author admin@nerdroco.com
 */
public class FullTime extends Employee {

    private double salary;
    private double overtime;

    public FullTime(int id, String name, double sal,
                    double hourAndHalf, Vehicle vehicle){
        super(id, name, vehicle);
        this.overtime = hourAndHalf;
        this.salary = sal;
    }

    @Override
    public double calculatePay() {
        System.out.println("Full time employee.");
        return (this.salary + this.overtime);
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return overtime
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * @param overtime the overtime to set
     */
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
}
