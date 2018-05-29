package PayrollSystem;

/**
 *
 * @author admin@nerdroco.com
 */
public class PartTime extends Employee {
    private double rate;
    private double hoursWorked;

    public PartTime(int id, String name, double rate,
                    double hoursWorked2, Vehicle v1){
        super(id, name, v1);
        this.rate = rate;
        this.hoursWorked = hoursWorked2;
    }

    @Override
    public double calculatePay() {
        System.out.println("Part time employee.");
        return rate * hoursWorked;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return hoursWorked
     */
    public double getHourWorked() {
        return hoursWorked;
    }

    /**
     * @param hourWorked set the hoursWorked
     */
    public void setHourWorked(double hourWorked) {
        this.hoursWorked = hourWorked;
    }
}
