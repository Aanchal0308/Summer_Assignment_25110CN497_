package Day28;
//Building ticket booking system for movies
import java.util.Scanner;

public class program111 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int[] movieIds = new int[50];
        String[] movieTitles = new String[50];
        double[] ticketPrices = new double[50];
        int[] availableSeats = new int[50];
        
        int movieCount = 0; 
        int choice;

        movieIds[0] = 101;
        movieTitles[0] = "Inception";
        ticketPrices[0] = 250.0;
        availableSeats[0] = 40; 
        movieCount++;

        movieIds[1] = 102;
        movieTitles[1] = "Interstellar";
        ticketPrices[1] = 300.0;
        availableSeats[1] = 5; 
        movieCount++;

        movieIds[2] = 103;
        movieTitles[2] = "The Dark Knight";
        ticketPrices[2] = 200.0;
        availableSeats[2] = 50;
        movieCount++;

        System.out.println("=== WELCOME TO THE SIMPLE MOVIE TICKET BOOKING SYSTEM ===");

        do {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Add a New Movie (Admin Only)");
            System.out.println("2. Show Available Movies & Seats");
            System.out.println("3. Book Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) 
            {
                case 1:
                    if (movieCount >= 50) 
                    {
                        System.out.println("ERROR: Database is full!");
                        break;
                    }

                    System.out.print("Enter Unique Movie ID (Integer): ");
                    int newId = sc.nextInt();
                    sc.nextLine(); 

                    boolean idExists = false;
                    for (int i = 0; i < movieCount; i++) 
                    {
                        if (movieIds[i] == newId) 
                        {
                            idExists = true;
                            break;
                        }
                    }

                    if (idExists) 
                    {
                        System.out.println("ERROR: This Movie ID already exists!");
                    } 
                    else 
                    {
                        System.out.print("Enter Movie Title: ");
                        String newTitle = sc.nextLine();
                        System.out.print("Enter Ticket Price: ₹");
                        double newPrice = sc.nextDouble();
                        System.out.print("Enter Total Seats Available: ");
                        int newSeats = sc.nextInt();

                        movieIds[movieCount] = newId;
                        movieTitles[movieCount] = newTitle;
                        ticketPrices[movieCount] = newPrice;
                        availableSeats[movieCount] = newSeats;

                        System.out.println("SUCCESS: \"" + newTitle + "\" added to the schedule!");
                        movieCount++;
                    }
                    break;

                case 2:
                    if (movieCount == 0) 
                    {
                        System.out.println("No movies currently scheduled.");
                        break;
                    }

                    System.out.println("\n------------------------------------------------------------------");
                    System.out.printf("%-10s %-25s %-15s %-15s\n", "MOVIE ID", "TITLE", "PRICE", "SEATS LEFT");
                    System.out.println("------------------------------------------------------------------");
                    for (int i = 0; i < movieCount; i++) {
                        System.out.printf("%-10d %-25s ₹%-14.2f %-15d\n", movieIds[i], movieTitles[i], ticketPrices[i], availableSeats[i]);
                    }
                    System.out.println("------------------------------------------------------------------");
                    break;

                case 3:
                    // --- BOOK TICKETS LOGIC ---
                    System.out.print("Enter the Movie ID you want to book: ");
                    int searchId = sc.nextInt();
                    int foundIndex = -1;

                    // Linear search to find the movie matching the ID
                    for (int i = 0; i < movieCount; i++) 
                    {
                        if (movieIds[i] == searchId) 
                        {
                            foundIndex = i;
                            break;
                        }
                    }

                    if (foundIndex != -1) {
                        System.out.println("Selected Movie: " + movieTitles[foundIndex]);
                        System.out.println("Ticket Price  : ₹" + ticketPrices[foundIndex]);
                        System.out.println("Seats Left    : " + availableSeats[foundIndex]);
                        
                        System.out.print("\nEnter number of tickets to book: ");
                        int ticketsToBook = sc.nextInt();

                        if (ticketsToBook <= 0) 
                        {
                            System.out.println("ERROR: Invalid number of tickets.");
                        } 
                        else if (ticketsToBook > availableSeats[foundIndex]) 
                        {
                            System.out.println("ERROR: Not enough seats available!");
                        } 
                        
                        else 
                        {
                            double totalCost = ticketsToBook * ticketPrices[foundIndex];
                            
                            availableSeats[foundIndex] -= ticketsToBook;

                            System.out.println("\n BOOKING CONFIRMED!");
                            System.out.println("Movie        : " + movieTitles[foundIndex]);
                            System.out.println("Tickets Booked: " + ticketsToBook);
                            System.out.printf("Total Paid   : ₹%.2f\n", totalCost);
                            System.out.println("Remaining Seats for this show: " + availableSeats[foundIndex]);
                        }
                    } 
                    else 
                    {
                        System.out.println("ERROR: Movie ID not found.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Choose between 1 and 4.");
            }
        } while (choice != 4);
    }
}
