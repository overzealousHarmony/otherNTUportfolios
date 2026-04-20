import java.util.Scanner;

public class P4{
	public static void main(String[] args)
	{
		Scanner enter = new Scanner(System.in);	
		System.out.println("Height= ");
		String input_P4 = enter.nextLine();
		int height = Integer.parseInt(input_P4);
		
		String pattern = "";
		String AA = "AA";
		String BB = "BB";
		boolean isA = false;
		int temp = 1;
		while (temp<=height) {
			if (isA == true){
				pattern = BB+ pattern;
				isA = false;
			}
			else{
				pattern = AA+ pattern;
				isA = true;
			}
			System.out.println(pattern);
			temp++;
		}
	}
	
}