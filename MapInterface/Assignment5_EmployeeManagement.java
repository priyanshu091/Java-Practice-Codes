package MapInterface;/*
 * Assignment 5: Employee Salary Management System
 * 
 * Objective: Combine all learned Map methods in a comprehensive program
 * 
 * Instructions:
 * 1. Create a Map to store employee IDs (Integer) as keys and salaries (Double) as values
 * 2. Add 8 employees with their salaries
 * 3. Display all employee IDs using keySet()
 * 4. Check if specific employee IDs exist
 * 5. Give a 10% raise to 3 employees (use replace)
 * 6. Add a new employee only if they don't exist (use putIfAbsent)
 * 7. Remove 2 employees who left the company
 * 8. Calculate and display total salary expenditure using values()
 * 9. Calculate and display average salary
 * 10. Use entrySet() to find and display highest and lowest paid employees
 * 11. Display final employee count
 * 12. Clear the entire map and verify it's empty
 * 
 * Sample Output:
 * Initial Employees: [101, 102, 103, 104, 105, 106, 107, 108]
 * Employee 105 exists: true
 * Gave 10% raise to employees: 102, 104, 106
 * Added new employee 109
 * Removed employees: 101, 108
 * 
 * Salary Statistics:
 * Total Salary Expenditure: $485,000.00
 * Average Salary: $69,285.71
 * Highest Paid: Employee 107 - $95,000.00
 * Lowest Paid: Employee 103 - $45,000.00
 * Final Employee Count: 7
 * 
 * After clearing map:
 * Is map empty? true
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Assignment5_EmployeeManagement {
    public static void main(String[] args) {

       // Creating a HashMap to store employee IDs and salaries
        Map<Integer,Double> employeeSalaries = new HashMap<>();


       // Adding 8 employees with their salaries
        employeeSalaries.put(101, 50000.0);
        employeeSalaries.put(102, 60000.0);
        employeeSalaries.put(103, 45000.0);
        employeeSalaries.put(104, 70000.0);
        employeeSalaries.put(105, 55000.0);
        employeeSalaries.put(106, 80000.0);
        employeeSalaries.put(107, 95000.0);
        employeeSalaries.put(108, 65000.0);

        //Displaying all employee IDs using keySet()
        Set<Integer> employeeIdSet=employeeSalaries.keySet();
        System.out.println("Initial Employees: " + employeeIdSet);

        //Check if specific employee IDs exist
        boolean exists105 = employeeSalaries.containsKey(105);
        System.out.println("Employee 105 exists: " + exists105);

        boolean exists999 = employeeSalaries.containsKey(999);
        System.out.println("Employee 999 exists: " + exists999);

       // Giving a 10% raise to 3 employees (using replace)
        System.out.print("Gave 10% raise to employees: ");

Double salary102= employeeSalaries.get(102);
employeeSalaries.replace(102,salary102*1.10);
        System.out.print("102");


        Double salary106= employeeSalaries.get(106);
employeeSalaries.replace(106,salary106*1.10);
        System.out.print(", 106");

        Double salary104 = employeeSalaries.get(104);
        employeeSalaries.replace(104, salary104 * 1.10);
        System.out.print(", 104");
        System.out.println();

        //Adding a new employee only if they don't exist (using putIfAbsent)

employeeSalaries.putIfAbsent(105,320000.0);       // Won't replace existing salary

        Double result=employeeSalaries.putIfAbsent(109,220000.0);

        if (result==null){
            System.out.println("Successfully Added new Employee 109");
        }

//Removing 2 employees who left the Company
        employeeSalaries.remove(108);
        employeeSalaries.remove(101);

        System.out.println("Removed employees: 108, 101");

        System.out.println("\nSalary Statistics:");

       // Calculating and displaying total salary expenditure using values()

        Collection<Double> salaries = employeeSalaries.values();
                double total_Salary = 0;
        for (Double salary : salaries) {
              total_Salary = total_Salary+salary;


        }
        System.out.printf("Total Salary Expenditure: Rs %,.2f %n",total_Salary);

       //Calculating and displaying average salary

        double averageSalary = total_Salary / employeeSalaries.size();
        System.out.printf("Average Salary: Rs %,.2f%n", averageSalary);

       // Using entrySet() to find and display highest and lowest paid employees

        Set<Map.Entry<Integer, Double>> entries= employeeSalaries.entrySet();

        Double highestSalary = Double.MIN_VALUE;
        Integer highestSalEmpID= null;
        Double lowestSalary = Double.MAX_VALUE;
        Integer lowestSalEmpID = null;

        for (Map.Entry<Integer, Double> entry : entries) {
            Integer employeeID= entry.getKey();
            Double Salary= entry.getValue();


            if (Salary>highestSalary){

                highestSalary=Salary;
                highestSalEmpID=employeeID;
            }

            if (Salary<lowestSalary){
                lowestSalary=Salary;
                lowestSalEmpID=employeeID;
            }
        }
        System.out.printf("Highest Paid: Employee %d - Rs %,.2f%n", highestSalEmpID, highestSalary);
        System.out.printf("Lowest Paid: Employee %d - Rs %,.2f%n", lowestSalEmpID, lowestSalary);

//Displaying Final Employee Size
        System.out.println("Final Employee Count: " + employeeSalaries.size());

       // Clear the entire map and verify it's empty
        employeeSalaries.clear();
        System.out.println("\nAfter clearing map:");
        System.out.println("Is map empty? " + employeeSalaries.isEmpty());
    }
}
