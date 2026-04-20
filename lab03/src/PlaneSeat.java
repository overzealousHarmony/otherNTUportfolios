public class PlaneSeat{
	int seatId;
	boolean assigned = false;
	int customerId=999999;
	
	public PlaneSeat(int seat_id) {
		this.seatId = seat_id;
	}
	
	public int getSeatID(){
		return seatId;
	}
	
	public int getCustomerID(){
		return customerId;
	}
	public boolean isOccupied() {
		return assigned;
	}
	public void assign(int cust_id) {
		customerId = cust_id;
		assigned = true;
	}
	public void unAssign() {
		customerId =999999;
		assigned = false;
	}
}