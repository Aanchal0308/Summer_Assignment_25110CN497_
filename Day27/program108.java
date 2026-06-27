package Day27;

import java.util.ArrayList;
import java.util.Scanner;

public class program108
{
    private static ArrayList<Integer> studentIds = new ArrayList<>();
    private static ArrayList<String> studentNames = new ArrayList<>();
    private static ArrayList<Integer> mathMarks = new ArrayList<>();
    private static ArrayList<Integer> scienceMarks = new ArrayList<>();
    private static ArrayList<Integer> englishMarks = new ArrayList<>();
    
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int choice = 0;
        do
        {
            System.out.println("=========== Marksheet Generation System ============");
            System.out.println("1. Add New Student Marks");
            System.out.println("2. See All Student Marksheets");
            System.out.println("3. Search Marksheet by Student ID");
            System.out.println("4. Update Existing Student Marks");
            System.out.println("5. Delete Marksheet Record");
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
                case 1: addMarks(); break;
                case 2: viewMarksheets(); break;
                case 3: searchMarksheet(); break;
                case 4: updateMarks(); break;
                case 5: deleteMarks(); break;
                case 6: System.out.println("Exit System"); break;
                default: System.out.println("Invalid input"); break;
            }
        }
        while(choice != 6);
    }

    private static void addMarks()
    {
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        if(studentIds.contains(id))
        {
            System.out.println("Error: This Student ID " + id + " record already exists");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mathematics Marks (0-100): ");
        int math = sc.nextInt();

        System.out.print("Enter Science Marks (0-100): ");
        int science = sc.nextInt();

        System.out.print("Enter English Marks (0-100): ");
        int english = sc.nextInt();
        sc.nextLine(); 

        studentIds.add(id);
        studentNames.add(name);
        mathMarks.add(math);
        scienceMarks.add(science);
        englishMarks.add(english);
        
        System.out.println("Success: Student marks recorded successfully!");
    }

    private static void viewMarksheets() 
    {
        if (studentIds.isEmpty()) 
        {
            System.out.println("No records found.");
            return;
        }
        System.out.println("\n--- All Student Marksheets ---");
        for (int i = 0; i < studentIds.size(); i++) 
        {
            calculateAndDisplayReport(i);
        }
    }

    private static void searchMarksheet()
    {
        System.out.println("Enter the Student ID to search: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = studentIds.indexOf(id);
        if (index != -1) {
            System.out.println("\n Marksheet Found: ");
            calculateAndDisplayReport(index);
            return;
        }
        System.out.println("Error: Marksheet with ID " + id + " not found.");
    }

    private static void updateMarks()
    {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // Clear buffer

        int index = studentIds.indexOf(id);
        if (index != -1) 
        {
            System.out.print("Enter new name (or press enter to move forward): ");
            String name = sc.nextLine();
            if(!name.trim().isEmpty()) 
            {
                studentNames.set(index, name);
            }

            System.out.print("Enter new Math Marks (or press -1 to move forward): ");
            int math = sc.nextInt();
            if(math >= 0 && math <= 100) 
            {
                mathMarks.set(index, math);
            }

            System.out.print("Enter new Science Marks (or press -1 to move forward): ");
            int science = sc.nextInt();
            if(science >= 0 && science <= 100) 
            {
                scienceMarks.set(index, science);
            }

            System.out.print("Enter new English Marks (or press -1 to move forward): ");
            int english = sc.nextInt();
            sc.nextLine(); // Clear buffer
            if(english >= 0 && english <= 100) 
            {
                englishMarks.set(index, english);
            }

            System.out.println("Success: Marksheet record updated successfully!");
            return;
        }
        System.out.println("Error: Marksheet with ID " + id + " not found.");
    }

    private static void deleteMarks()
    {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        int index = studentIds.indexOf(id);
        if (index != -1) 
        {
            studentIds.remove(index);
            studentNames.remove(index);
            mathMarks.remove(index);
            scienceMarks.remove(index);
            englishMarks.remove(index);
            
            System.out.println("Success: Marksheet record deleted safely.");
            return;
        }
        System.out.println("Error: Marksheet with ID " + id + " not found.");
    }

    private static void calculateAndDisplayReport(int index) 
    {
        int math = mathMarks.get(index);
        int science = scienceMarks.get(index);
        int english = englishMarks.get(index);
        
        
        int totalMarks = math + science + english;
        double percentage = (totalMarks / 300.0) * 100;
        
        String status = "PASS";
        String grade = "Fail";
        
        if (math < 35 || science < 35 || english < 35) 
        {
            status = "FAIL";
            grade = "F";
        } 
        else 
        {
            
            if (percentage >= 85) 
            {
                grade = "A";
            } 
            else if (percentage >= 60) 
            {
                grade = "B";
            } 
            else
            {
                grade = "C";
            }
        }

        System.out.println("Student ID: " + studentIds.get(index) + " | Name: " + studentNames.get(index));
        System.out.println("   [Scores] Math: " + math + "/100 | Science: " + science + "/100 | English: " + english + "/100");
        System.out.printf("   [Result] Total: %d/300 | Percentage: %.2f%% | Status: %s | Final Grade: %s\n", 
                totalMarks, percentage, status, grade);
        System.out.println("----------------------------------------------------------------------");
    }
}

    

