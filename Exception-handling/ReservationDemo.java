
import java.util.Scanner;
import java.util.InputMismatchException;

class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    private boolean[] seats = new boolean[6];

    public void reserveSeat(int seatNumber)
            throws SeatAlreadyBookedException {

        if (seatNumber < 1 || seatNumber > 5) {
            throw new IllegalArgumentException("Invalid seat number! Choose between 1 and 5.");
        }

        if (seats[seatNumber]) {
            throw new SeatAlreadyBookedException(
                "Seat " + seatNumber + " is already booked!"
            );
        }

        seats[seatNumber] = true;
        System.out.println("Seat " + seatNumber + " reserved successfully!");
    }
}

public class ReservationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Reservation reservation = new Reservation();

        while (true) {
            try {
                System.out.println("\nAvailable seats: 1 to 5");
                System.out.print("Enter seat number (0 to exit): ");

                int seatNumber = sc.nextInt();

                if (seatNumber == 0) {
                    System.out.println("Exiting reservation system...");
                    break;
                }

                reservation.reserveSeat(seatNumber);

            } catch (InputMismatchException e) {
                System.out.println("Incorrect input! Please enter an integer.");
                sc.nextLine();

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            } catch (SeatAlreadyBookedException e) {
                System.out.println(e.getMessage());

            } finally {
                System.out.println("Transaction completed.");
            }
        }

        sc.close();
    }
}
