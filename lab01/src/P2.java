import java.util.Scanner;

public class P2{
	public static void main(String[] args)
	{
		Scanner enter = new Scanner(System.in);		
		System.out.println("Enter Salary Amount: ");
		String input_P2 = enter.nextLine();
		int salary = Integer.parseInt(input_P2);
		System.out.println("Enter Merit Points: ");
		String input_P22 = enter.nextLine();
		int merit = Integer.parseInt(input_P22);
		
		if (salary >=500 && salary <=600) {
			
			System.out.println("Salary: "+ salary+" Merit: "+ merit+ " -Grade C\n");
		}
		
		if (salary >=600 && salary <=649) {
			if (merit <10) {
				System.out.println("Salary: "+ salary+" Merit: "+ merit+"Grade C\n");
			}
			else {
				System.out.println("Salary: "+ salary+" Merit: "+ merit+"Grade B\n");
			}		
		}
		
		if (salary >=650 && salary <=700) {
			System.out.println("Salary: "+ salary+" Merit: "+ merit+"Grade B\n");
		}
			
		if (salary >=700 && salary <=799) {
			if (merit <20) {
				System.out.println("Salary: "+ salary+" Merit: "+ merit+"Grade B\n");
			}
			else {
				System.out.println("Salary: "+ salary+" Merit: "+ merit+"Grade A\n");
			}
		}
		
		if (salary >=800 && salary <=899) {
			System.out.println("Salary: "+ salary+" Merit: "+ merit+"Grade A\n");
		}
	
	}
}