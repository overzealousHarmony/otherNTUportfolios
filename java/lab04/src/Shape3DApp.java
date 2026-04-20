import java.util.Scanner;
public class Shape3DApp
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total number of figures: ");
		int pax = scan.nextInt();
		int Vol =0;
		int count = 1;
		
		while (count <= pax) {
			System.out.print ("\nChoose figure type: \n"
					+ "1. Sphere\n"
					+ "2. Pyramid \n"
					+ "3. cubiod\n"
					+ "4. cone\n"
					+ "5. cylinder\n");
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					System.out.print("Enter radius: ");
					int r = scan.nextInt();
					Circle circle = new Circle(r);
					Vol += 4*circle.calculateArea();
					break;
				case 2:
					System.out.print("Enter base: ");
					int b = scan.nextInt();
					System.out.print("Enter slant height: ");
					int sh = scan.nextInt();
					Triangle triangle = new Triangle(b, sh);
					Square square = new Square(b);
					Vol += square.calculateArea()+ 4*triangle.calculateArea();
					break;
				case 3:
					System.out.print("Enter length: ");
					int l = scan.nextInt();
					System.out.print("Enter breadth: ");
					int w = scan.nextInt();
					System.out.print("Enter height: ");
					int h = scan.nextInt();
					Rectangle rectangle1 = new Rectangle(l, w);
					Rectangle rectangle2 = new Rectangle(h, w);
					Rectangle rectangle3 = new Rectangle(l, h);
					Vol += 2*(rectangle1.calculateArea()+rectangle2.calculateArea()+rectangle3.calculateArea());
					break;
				case 4:	
					System.out.print("Enter radius: ");
					int r2 = scan.nextInt();
					System.out.print("Enter slant height: ");
					int l2 = scan.nextInt();
					Circle circleCone = new Circle(r2);
					Rectangle rectangleCone = new Rectangle(Math.PI*r2,l2);
					Vol += circleCone.calculateArea()+rectangleCone.calculateArea();
					break;
				case 5:
					System.out.print("Enter radius: ");
					int r3 = scan.nextInt();
					System.out.print("Enter height: ");
					int h2 = scan.nextInt();
					Circle circleCy = new Circle(r3);
					Rectangle rectangleCy = new Rectangle(Math.PI*r3,h2);
					Vol += 2*(circleCy.calculateArea()+rectangleCy.calculateArea());
					break;
				default:
					System.out.print("Invalid response");
			}
			count++;
		}
		System.out.print("Total volume= "+Vol);
	}
}		