package design;

public abstract class BaseEmployee implements Employee{

    private int employeeId;
    private String employeeName;
    private String department;
    private int salary;
    private String benefitCategory;

    public int employeeId(){
       return employeeId;
    }

}
