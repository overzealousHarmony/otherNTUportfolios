import java.util.Scanner;

public class P3{
	public static void main(String[] args)
	{
		
		Scanner enter = new Scanner(System.in);	
		System.out.println("Starting: ");
		String input_P3_1 = enter.nextLine();
		double start = Double.parseDouble(input_P3_1);
		System.out.println("Ending: ");
		String input_P3_2 = enter.nextLine();
		double end = Double.parseDouble(input_P3_2);
		System.out.println("Increment: ");
		String input_P3_3 = enter.nextLine();
		double inc = Double.parseDouble(input_P3_3);
		
		
		if (start > end) {
			System.out.println("Error");
		}
		else {
			System.out.println("Method:\n 1) For loop \n2) while-loop\n3)do/while-loop ");
			String input_P3_4 = enter.nextLine();
			System.out.printf("%10s  %10s \n", "US$", "S$");
			System.out.printf("--------------------00-\n");
			switch(input_P3_4){
				case "1":
					for (double j= start; j<=end; j+=inc) {
						System.out.printf("%10s  %10s \n", (int) j, j*1.82);
					}
					break;
				case "2":
					int temp = (int) start;
					while (temp<=end) {
						System.out.printf("%10s  %10s \n", temp, (double) temp*1.82);
						temp +=inc;
					}
					break;
				case "3":
					do {
						System.out.printf("%10s  %10s \n", (int) start, start*1.82);
						start +=inc;						
					}
					while (start<=end);
					break;
			}
			
		}
		
	}
}