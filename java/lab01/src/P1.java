import java.util.Scanner;
public class P1{
	public static void main(String[] args)
	{
		Scanner enter = new Scanner(System.in);
		System.out.println("Select A, C or D: ");	
		String input_P1 = enter.nextLine();
		
		switch(input_P1) {
			case "A":
			case "a":
				System.out.println("Action movie fan \n");
				break;
			case "C":
			case "c":
				System.out.println("Comedy movie fan \n");
				break;	
			case "D":
			case "d":
				System.out.println("Drama movie fan \n");
				break;
			default:
				System.out.println("Invalid choice\n");
				break;
		}

	}
}