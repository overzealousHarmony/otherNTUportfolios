import java.util.Scanner;
public class Shape2DApp
{
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total number of shapes: ");
		int pax = scan.nextInt();
		int Area =0;
		int count = 1;
		
		while (count <= pax) {
			System.out.print ("\nShape " + count +") Choose shape: "
					+ "\n1. Square"
					+ "\n2. Rectangle"
					+ "\n3. Circle"
					+ "\n4. Triangle\n");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.print("Enter length: ");
				int s = scan.nextInt();
				Square square = new Square(s);
				Area += square.calculateArea();
				break;
			case 2:
				System.out.print("Enter length: ");
				int l = scan.nextInt();
				System.out.print("Enter breadth: ");
				int w = scan.nextInt();
				Rectangle rectangle = new Rectangle(l, w);
				Area += rectangle.calculateArea();
				break;
			case 3:
				System.out.print("Enter radius: ");
				int r = scan.nextInt();
				Circle circle = new Circle(r);
				Area += circle.calculateArea();
				break;
			case 4:
				System.out.print("Enter base: ");
				int b = scan.nextInt();
				System.out.print("Enter height: ");
				int h = scan.nextInt();
				Triangle triangle = new Triangle(b, h);
				Area += triangle.calculateArea();
				break;
			default: 
				System.out.print("Invalid response");			
			}
			count++;
		}
		System.out.print("Total area= "+Area);
	}
}