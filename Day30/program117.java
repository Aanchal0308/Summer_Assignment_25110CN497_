package Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class program117 
{
    // Five simple lists to hold all student fields without needing any extra classes
    private static ArrayList<Integer> sIds = new ArrayList<>();
    private static ArrayList<String> sNames = new ArrayList<>();
    private static ArrayList<Integer> sAges = new ArrayList<>();
    private static ArrayList<String> sCourses = new ArrayList<>();
    private static ArrayList<Double> sGpas = new ArrayList<>();
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice = 0;
        do
        {
            System.out.println("===========Student Record Management System============");
            System.out.println("1. Add new Student record");
            System.out.println("2. See All Students record");
            System.out.println("3. Search by Student ID");
            System.out.println("4. Update existing student record");
            System.out.println("5. Delete Student record");
            System.out.println("6. Exit System");
            System.out.println("Enter your choice (1-6)");

            while (!sc.hasNextInt()) 
            {
                System.out.print("Invalid input. Please enter a number between 1 and 6: ");
                sc.next();
            }
            choice = sc.nextInt();
            sc.nextLine(); 

            switch(choice)
            {
                case 1: addStudent(); break;
                case 2: viewStudents(); break; 
                case 3: searchStudent(); break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: System.out.println("Exit System"); break;
                default: System.out.println("Invalid input"); break;
            }
        }
        while(choice != 6);
    }

    private static void addStudent()
    {
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        
        if(sIds.contains(id))
        {
            System.out.println("Error: This ID " + id + " record already exists");
            return;
        }

        System.out.print("Enter the name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter the enrolled course: ");
        String course = sc.nextLine();

        System.out.print("Enter the GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine(); 

        sIds.add(id);
        sNames.add(name);
        sAges.add(age);
        sCourses.add(course);
        sGpas.add(gpa);
        
        System.out.println("Success: Student record added successfully!");
    }

    private static void viewStudents() {
        if (sIds.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- All Student Records ---");
        for (int i = 0; i < sIds.size(); i++) {
            System.out.println("ID: " + sIds.get(i) + 
                               " | Name: " + sNames.get(i) + 
                               " | Age: " + sAges.get(i) + 
                               " | Course: " + sCourses.get(i) + 
                               " | GPA: " + sGpas.get(i));
        }
    }

    private static void searchStudent()
    {
        System.out.println("Enter the student id to search: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        
        int index = sIds.indexOf(id);
        if (index != -1) 
        {
            System.out.print("\n Record Found: ");
            System.out.println("ID: " + sIds.get(index) + 
                               " | Name: " + sNames.get(index) + 
                               " | Age: " + sAges.get(index) + 
                               " | Course: " + sCourses.get(index) + 
                               " | GPA: " + sGpas.get(index));
            return;
        }
        System.out.println("Error: Student record with ID " + id + " not found.");
    }

    private static void updateStudent()
    {
        System.out.print("Enter student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = sIds.indexOf(id);
        if (index != -1) 
        {
            System.out.print("Enter new name (or press enter to move forward): ");
            String name = sc.nextLine();
            if(!name.trim().isEmpty()) 
            {
                sNames.set(index, name);
            }

            System.out.print("Enter new age (or press 0 to move forward): ");
            int age = sc.nextInt();
            sc.nextLine(); 
            if(age > 0) 
            {
                sAges.set(index, age);
            }

            System.out.print("Enter new course (or press enter to move forward): ");
            String course = sc.nextLine();
            if(!course.trim().isEmpty()) 
            {
                sCourses.set(index, course);
            }

            System.out.print("Enter new GPA (or press -1 to move forward): ");
            double gpa = sc.nextDouble(); 
            sc.nextLine(); 
            if(gpa >= 0) 
            {
                sGpas.set(index, gpa);
            }

            System.out.println("Success: Student record updated successfully!");
            return;
        }
        System.out.println("Error: Student record with ID " + id + " not found.");
    }

    private static void deleteStudent()
    {
        System.out.print("Enter student id to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = sIds.indexOf(id);
        if (index != -1) 
        {
            sIds.remove(index);
            sNames.remove(index);
            sAges.remove(index);
            sCourses.remove(index);
            sGpas.remove(index);
            
            System.out.println("Success: Student record deleted safely.");
            return;
        }
        System.out.println("Error: Student record with ID " + id + " not found.");
    }
}
