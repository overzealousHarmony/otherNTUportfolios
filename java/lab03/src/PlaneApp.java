import java.util.Scanner;
public class PlaneApp{
	public static void main(String[] args) {
		Plane plane= new Plane();
		int choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("(1) Show number of empty seats\n"
				+ "(2) Show the list of empty seats\n"
				+ "(3) Show the list of seat assignments by seat ID\n"
				+ "(4) Show the list of seat assignments by customer ID\n"
				+ "(5) Assign a customer to a seat\n"
				+ "(6) Remove a seat assignment\n"
				+ "(7) Exit\n");
		do{
			System.out.println("Enter the number of your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				plane.showNumEmptySeats();
			break;
			case 2:
				plane.showEmptySeats();
			break;
			case 3:
				plane.showAssignedSeats(true);
			break;
			case 4:
				plane.showAssignedSeats(false);
			break;
			case 5:
				System.out.println("Assigning Seat...\nPlease enter SeatID: ");
				int seatId = sc.nextInt();
				System.out.println("Please enter Customer ID: ");
				int cust_id = sc.nextInt();
				plane.assignSeat(seatId, cust_id);
			break;
			case 6:
				System.out.println("Enter SeatID to unassign customer from: ");
				int seatId2 = sc.nextInt();
				plane.unAssignSeat(seatId2);
			break;
			case 7: break;
			}
		} while (choice < 7);
		
	}
}

