import java.util.Scanner;

public class airlineReservation{
    static int seats[] = new int[12];
    static Scanner sc = new  Scanner(System.in);

    public static void displaySeats(){
        System.out.println("Seats: ");
        for (int i = 1; i <= 10; i++){
            System.out.println("Seat "+ i + ": "
                + (seats[i] == 0? "Available"
                : "Booked"));
        }
    }

    public static void reserveSeat(){
        System.out.println("Enter Seat number to reserve: ");
        int seat = sc.nextInt();
        if (seats[seat] == 0) {
            seats[seat] = 1;
            System.out.println("Seat " + seat + " is reserved successfully");
        } else {
            System.out.println("Seat " + seat + " is already booked, please choose another one.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Latam Airlines");
        while (true){
            System.out.println("Please select an option: ");
            System.out.println("1. View Available seats");
            System.out.println("2. Book a seat");
            System.out.println( "3. Exit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    displaySeats();
                    break;
                case 2:
                    reserveSeat();
                    break;
                case 3:
                    System.out.println("Thank you for choosing Latam"
                        + "Airlines!");
                    System.exit(0); //ends program
            }
        }
    }
}