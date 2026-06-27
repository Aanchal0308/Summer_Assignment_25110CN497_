package Day27;

import java.util.ArrayList;
import java.util.Scanner;

public class program107 
{
    private static ArrayList<Integer> employeeId=new ArrayList<>();
    private static ArrayList<String> employeeName=new ArrayList<>();
    private static ArrayList<Double> basicSalary=new ArrayList<>();
    private static ArrayList<Double> allowances=new ArrayList<>();
    private static ArrayList<Integer> unpaidLeaves=new ArrayList<>();

    private static Scanner sc=new Scanner(System.in);
    private static final double TAX_RATE = 0.10; 
    private static final double DAILY_LEAVE_DEDUCTION = 500.00; 


    public static void main(String[] args)
    {
        int choice=0;
        do
        {
        System.out.println("Salary Management System");
        System.out.println("1. Generate new salary record");
        System.out.println("2. View All Payroll Statements");
        System.out.println("3. Search Payroll by Employee ID");
        System.out.println("4. Update Salary Parameters");
        System.out.println("5. Delete Payroll Record");
        System.out.println("6. Exit System");
        System.out.print("Enter your choice (1-6): ");


        while(!sc.hasNextInt())
        {
            System.out.println("Invalid input. Enter numbers 1-6");
            sc.next();
        }
         
        choice=sc.nextInt();
        sc.nextLine();

        switch(choice)
        {
            case 1: newRecord(); break;
            case 2: viewPayroll(); break;
            case 3: searchPayroll(); break;
            case 4: updatePayroll(); break;
            case 5: deletepayroll(); break;
            case 6: System.out.println("Thank you for visiting the salary management system. HAve a nice day");
            default : System.out.println("Invalid choice. Choose from 1-6.");
        }
        }
        while(choice !=6);
    }

    private static void newRecord()
    {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        if(employeeId.contains(id))
        {
            System.out.println("This empolyee id already exists.");
            return;
        }

        System.out.print("Enter the employee name: ");
        String name=sc.nextLine();
        System.out.print("Enter Basic salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter the allowances/bonus: ");
        double bonus=sc.nextDouble();
        System.out.print("Enter number of unpaid leaves: ");
        int leaves =sc.nextInt();
        sc.nextLine();

        employeeId.add(id);
        employeeName.add(name);
        basicSalary.add(salary);
        allowances.add(bonus);
        unpaidLeaves.add(leaves);

        System.out.println("Success: Payroll record added successfully!");
        
    }

    private static void viewPayroll()
    {
      if(employeeId.isEmpty())
      {
        System.out.print("No records found");
        return;
      }

      System.out.println("\n All employee payroll record");
      for(int i=0;i<employeeId.size();i++)
      {
        calculateandDisplayPay(i);
      }
      
    }

    private static void searchPayroll()
    {
        System.out.println("Enter employee id");
        int id=sc.nextInt();
        sc.nextLine();
        int index=employeeId.indexOf(id);

        if(index != -1)
        {
            System.out.println("\n Record Found");
            calculateandDisplayPay(index);
            return;
        }

        System.out.println("Error:Payroll uner this id not found");
    }

    private static void updatePayroll()
    {
        System.out.println("Enter employee id");
        int id=sc.nextInt();
        sc.nextLine();
        int index=employeeId.indexOf(id);

        if(index != -1)
        {
            System.out.print("Enter new name (or press enter to move further)");
            String name=sc.nextLine();
            if(!name.trim().isEmpty())
            {
                employeeName.set(index,name);
            }

            System.out.println("Enter new basic salary (or press -1 to move further) ");
            double salary =sc.nextInt();
            if(salary>=0)
                basicSalary.set(index, salary);

            System.out.println("Enter new basic salary (or press -1 to move further) ");
            double allowances=sc.nextInt();
            if(allowances>=0)
                basicSalary.set(index, allowances);

            System.out.print("Enter updated Unpaid Leaves count (or press -1 to move forward): ");
            int leaves = sc.nextInt();
            sc.nextLine(); 
            if(leaves >= 0) 
            {
                unpaidLeaves.set(index, leaves);
            }
            System.out.println("Success: Payroll record updated successfully!");
            return;

        }
        System.out.println("Error: Payroll record under this id not found");
        
    }

    private static void deletepayroll()
    {
        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer

        int index = employeeId.indexOf(id);
        if (index != -1) 
        {
            employeeId.remove(index);
            employeeName.remove(index);
            basicSalary.remove(index);
            allowances.remove(index);
            unpaidLeaves.remove(index);
            
            System.out.println("Success: Payroll record deleted safely.");
            return;
        }
        System.out.println("Error: Payroll record under this id not found");
    }

    private static void calculateandDisplayPay(int index)
    {
        double basic = basicSalary.get(index);
        double allowance = allowances.get(index);
        int leaves = unpaidLeaves.get(index);

        double grossSalary = basic + allowance;
        double textDeduction = grossSalary * TAX_RATE;              
        double leavePenalty = leaves * DAILY_LEAVE_DEDUCTION;       
        double netSalary = grossSalary - textDeduction - leavePenalty;

        System.out.println("Emp ID: " + employeeId.get(index) + " | Name: " + employeeName.get(index));
        System.out.println("   [Earnings] Gross Salary: " + grossSalary + " (Basic: " + basic + " + Allowance: " + allowance + ")");
        System.out.println("   [Deductions] Text Deduction: " + textDeduction + " | Leave Penalty (" + leaves + " days): " + leavePenalty);
        System.out.println("   --> TAKE HOME NET SALARY: " + netSalary);
        System.out.println("------------------------------------------------");
    }
}

    