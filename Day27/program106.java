package Day27;

import java.util.ArrayList;
import java.util.Scanner;

public class program106 
{
    
    private static ArrayList<Integer> employeeIds = new ArrayList<>();
    private static ArrayList<String> employeeNames = new ArrayList<>();
    private static ArrayList<String> employeeDepartments = new ArrayList<>();
    private static ArrayList<String> employeeDesignations = new ArrayList<>();
    private static ArrayList<Double> employeeSalaries = new ArrayList<>();
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice = 0;
        do
        {
            System.out.println("\n=========== Employee Management System ============");
            System.out.println("1. Add New Employee Record");
            System.out.println("2. See All Employee Records");
            System.out.println("3. Search by Employee ID");
            System.out.println("4. Update Existing Employee Record");
            System.out.println("5. Delete Employee Record");
            System.out.println("6. Exit System");
            System.out.println("Enter your choice (1-6): ");

            while (!sc.hasNextInt()) 
            {
                System.out.print("Invalid input. Please enter a number between 1 and 6: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice)
            {
                case 1: addEmployee(); break;
                case 2: viewEmployees(); break; 
                case 3: searchEmployee(); break;
                case 4: updateEmployee(); break;
                case 5: deleteEmployee(); break;
                case 6: System.out.println("Exiting System. Goodbye!"); break;
                default: System.out.println("Invalid choice! Please choose 1-6."); break;
            }
        }
        while(choice != 6);
    }

    
    private static void addEmployee()
    {
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        if(employeeIds.contains(id))
        {
            System.out.println("Error: An employee with ID " + id + " already exists.");
            return;
        }

        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department (e.g., IT, HR, Sales): ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation/Role (e.g., Developer, Manager): ");
        String role = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); 
        
        employeeIds.add(id);
        employeeNames.add(name);
        employeeDepartments.add(dept);
        employeeDesignations.add(role);
        employeeSalaries.add(salary);
        
        System.out.println("Success: Employee record added successfully!");
    }

    
    private static void viewEmployees() 
    {
        if (employeeIds.isEmpty()) 
        {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- All Employee Records ---");
        for (int i = 0; i < employeeIds.size(); i++) 
        {
            System.out.println("ID: " + employeeIds.get(i) + 
                               " | Name: " + employeeNames.get(i) + 
                               " | Dept: " + employeeDepartments.get(i) + 
                               " | Role: " + employeeDesignations.get(i) + 
                               " | Salary: ₹" + employeeSalaries.get(i));
        }
    }

    
    private static void searchEmployee()
    {
        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = employeeIds.indexOf(id);
        if (index != -1) 
        {
            System.out.println("\nRecord Found:");
            System.out.println("ID: " + employeeIds.get(index) + 
                               " | Name: " + employeeNames.get(index) + 
                               " | Dept: " + employeeDepartments.get(index) + 
                               " | Role: " + employeeDesignations.get(index) + 
                               " | Salary: ₹" + employeeSalaries.get(index));
            return;
        }
        System.out.println("Error: Employee with ID " + id + " not found.");
    }

    
    private static void updateEmployee()
    {
        System.out.print("Enter Employee ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = employeeIds.indexOf(id);
        if (index != -1) 
        {
            System.out.print("Enter new name (or press enter to skip): ");
            String name = sc.nextLine();
            if(!name.trim().isEmpty()) 
            {
                employeeNames.set(index, name);
            }

            System.out.print("Enter new department (or press enter to skip): ");
            String dept = sc.nextLine();
            if(!dept.trim().isEmpty()) 
            {
                employeeDepartments.set(index, dept);
            }

            System.out.print("Enter new designation (or press enter to skip): ");
            String role = sc.nextLine();
            if(!role.trim().isEmpty())
            {
                employeeDesignations.set(index, role);
            }

            System.out.print("Enter new salary (or press -1 to skip): ");
            double salary = sc.nextDouble(); 
            sc.nextLine(); 
            if(salary >= 0) 
            {
                employeeSalaries.set(index, salary);
            }

            System.out.println("Success: Employee record updated successfully!");
            return;
        }
        System.out.println("Error: Employee with ID " + id + " not found.");
    }


    private static void deleteEmployee()
    {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = employeeIds.indexOf(id);
        if (index != -1) 
        {
            
            employeeIds.remove(index);
            employeeNames.remove(index);
            employeeDepartments.remove(index);
            employeeDesignations.remove(index);
            employeeSalaries.remove(index);
            
            System.out.println("Success: Employee record deleted safely.");
            return;
        }
        System.out.println("Error: Employee with ID " + id + " not found.");
    }
}
