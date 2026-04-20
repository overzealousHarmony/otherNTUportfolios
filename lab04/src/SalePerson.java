public class SalePerson
{
	String firstName;
	String lastName;
	int totalSales;
	
	public SalePerson(String f, String l, int s) {
		firstName = f;
		lastName = l;
		totalSales = s;
	}
	
	public String toString() {
		String combined = firstName + ", " + lastName + ": " + Integer.toString(totalSales);
		return combined;
	}
	public boolean equals(SalePerson o) {
		if (o.firstName.compareTo(firstName) == 0 && o.lastName.compareTo(lastName) == 0) return true;
		else return false;
	}
	public int compareTo(SalePerson o) {
		//1 if o is greater, if tie 1 if o has ascending last name
		if (o.totalSales < totalSales) return -1;
		else if (o.totalSales > totalSales) return 1;
		else {
			if (o.lastName.compareTo(lastName) < 0) return 1;
			else return -1;
		}
	}
	
	public String getFirstName(){
		return firstName;
	} 
	public String getLastName(){
		return lastName;
	} 
	public int getTotalSales(){
		return totalSales;
	} 
	
}