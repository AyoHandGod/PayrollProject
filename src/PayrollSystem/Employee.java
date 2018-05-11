package PayrollSystem;

/**
 *
 * @ author admin@nerdroco.com
 */
public class Employee {

    // class variables
    private int empId;
    private String name;
    private Vehicle vehicle;

    /**
     *
     * @return int empId
     */
    public int getEmpId() {
        return empId;
    }

    /**
     *
     * @param empId int new id to be set
     */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /**
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name String new name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return Vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     *
     * @param vehicle Vehichle new vehicle to be set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
