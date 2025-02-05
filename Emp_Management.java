import java.util.Scanner;
public class Emp_Management {

    private int employeeID;
    private String name;
    private String Department;
    private double Salary;

    private static int totalEmployees = 0;

    //default contructor
    public Emp_Management(){
        this.employeeID = 0;
        this.name = "Unknown";
        this.Department = "Not assigned";
        this.Salary = 0;
        totalEmployees++;
    }

    //parameterized contructor
    public Emp_Management(int employeeID, String name, String Department, double Salary){
        this.employeeID = employeeID;
        this.name = name;
        this.Department = Department;
        this.Salary = Salary;
        totalEmployees++;
    }

    public void displayEmployees(){

        System.out.println("Employee ID: "+ this.employeeID);
        System.out.println("Name: "+ this.name);
        System.out.println("Department: "+ this.Department);        
        System.out.println("Salary: "+ this.Salary);
        System.out.println("***********************");
    }

    public double calculateSalary(){
        return this.Salary;
    }

    public static void displaytotalEmployees(){
            System.out.println("Total Employees: "+ totalEmployees);
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter the number of employees: ");
            int numEmployees = sc.nextInt();
            sc.nextLine();
    
            for (int i = 0; i < numEmployees; i++) {
                System.out.println("\nEnter details for Employee " + (i + 1));
    
                System.out.print("Enter Employee ID: ");
                int employeeID = sc.nextInt();
                sc.nextLine();
    
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
    
                System.out.print("Enter Department: ");
                String department = sc.nextLine();
    
                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
    
                Emp_Management emp = new Emp_Management(employeeID, name, department, salary);
    
                emp.displayEmployees();
            }
    
            Emp_Management.displaytotalEmployees();

        sc.close();
    }
}
