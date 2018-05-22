package PayrollSystem;

/**
 *
 * @ author admin@nerdroco.com
 */
public abstract class Employee {

    // class variables
    private int empId;
    private String name;
    private Vehicle vehicle;

    // class constructor
    public Employee(){
        // default constructor is a constructor with zero parameters
        System.out.println(".. inside default constructor");
        empId = 0;
        name = "";
    }

    public Employee (int pEmpId, String pName, Vehicle pV){
        // a non default constructor is a constructor with at least 1 parameter
        System.out.println(".. inside Employee non-default constructor");
        empId = pEmpId;
        name = pName;
        this.vehicle = pV;  // pV must have been previously created in the calling env.
    }

    public Employee (int pEmpId, String pName,
                        String pPlate, String pColour){
        // a non default constructor is a constructor with at least 1 parameter
        System.out.println(".. insdie Employee non-default constructor");
        empId = pEmpId;
        name = pName;
        this.vehicle = new Vehicle(pPlate, pColour);
    }

    public abstract double calculatePay();

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
