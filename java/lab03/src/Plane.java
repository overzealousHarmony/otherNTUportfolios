public class Plane{
	PlaneSeat[] seat = new PlaneSeat[12];
	int numEmptySeat = 12;
	
	public Plane() {
		for (int i=0;i<12;i++) {
			seat[i]=new PlaneSeat(i+1);
		}
	}
	
	public PlaneSeat[] sortSeats() {
		PlaneSeat[] seat_copy = seat.clone();
		for (int i=0;i<12;i++) {
			for (int j=i+1;j<12;j++){
				PlaneSeat temp;
				if (seat_copy[j].getCustomerID() < seat_copy[i].getCustomerID()){
					temp= seat_copy[i];
					seat_copy[i]=seat_copy[j];
					seat_copy[j]=temp;
				}			
			}	
		}
		return seat_copy;
	}
	
	public void showNumEmptySeats() {
		System.out.println("There are "+ numEmptySeat +" empty seats.");
	}
	public void showEmptySeats() {
		System.out.println("The following seats are empty:\n");
		for (int i=0;i<12;i++) {
			if (seat[i].isOccupied() ==false) System.out.println("SeatID "+seat[i].seatId);
		}
	}
	
	public void showAssignedSeats(boolean bySeatId) {
		if (bySeatId==true) {
			for (int i=0;i<12;i++) {
				if (seat[i].isOccupied()==true) System.out.println("SeatID "+ seat[i].getSeatID() + " assigned to CustomerID "+ seat[i].getCustomerID());
			}
		}
		else {
			PlaneSeat[] seat_copy = sortSeats();
			for (int i=0;i<12;i++) {
				if (seat_copy[i].isOccupied()==true) System.out.println("SeatID "+ seat_copy[i].getSeatID() + " assigned to CustomerID "+ seat_copy[i].getCustomerID());
				else break;
			}
		}
	}
	
	public void assignSeat(int seatId, int cust_id) {
		if (seat[seatId-1].isOccupied()==true) System.out.println("Seat already assigned to a customer.");
		else {
			seat[seatId-1].assign(cust_id);
			System.out.println("Seat Assigned!");
			numEmptySeat--;
		}
	}
	
	public void unAssignSeat(int seatId) {
		if (seat[seatId-1].isOccupied()==false) System.out.println("Seat is already empty.");
		else {
			seat[seatId-1].unAssign();
			System.out.println("Seat Unssigned!");
			numEmptySeat++;
		}
	}
	
}