import java.util.Scanner;
import java.lang.Math;
public class Lab2p1 {
	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Perform the following methods:");
			System.out.println("1: miltiplication test");
			System.out.println("2: quotient using division by subtraction");
			System.out.println("3: remainder using division by subtraction");
			System.out.println("4: count the number of digits");
			System.out.println("5: position of a digit");
			System.out.println("6: extract all odd digits");
			System.out.println("7: quit");
			choice = sc.nextInt();
			switch (choice) {
			case 1: /* add mulTest() call */
				mulTest();
			break;
			
			case 2: /* add divide() call */
				System.out.println("m=");
				int m = sc.nextInt();
				System.out.println("n=");
				int n = sc.nextInt();
				System.out.println(m+"/"+n+"="+divide(m,n));
			break;
			
			case 3: /* add modulus() call */
				System.out.println("m=");
				int m2 = sc.nextInt();
				System.out.println("n=");
				int n2 = sc.nextInt();
				System.out.println(m2+"%"+n2+"="+modulus(m2,n2));
			break;
			
			case 4: /* add countDigits() call */
				System.out.println("n: ");
				int n3 = sc.nextInt();
				if (countDigits(n3)==0) {
					System.out.println("n: "+n3+" - Error Input!!");
				}
				else {
					System.out.println("n: "+n3+" - count = "+countDigits(n3));
				}
			break;
			
			case 5: /* add position() call */
				System.out.println("n: ");
				int n4 = sc.nextInt();
				System.out.println("digit: ");
				int digit = sc.nextInt();
				System.out.println("n: "+n4+" digit: "+position(n4,digit));
			break;
			
			case 6: /* add extractOddDigits() call */
				System.out.println("n: ");
				int n5 = sc.nextInt();
				if (n5<0) {
					System.out.println("oddDigits = Error Input!!");
				}
				else {
					System.out.println("oddDigits = "+extractOddDigits(n5));
				}
				
			break;
			
			case 7: System.out.println("Program terminating ….");
			}
		} while (choice < 7);
	}
	/* add method code here */
	public static void mulTest() {
		int score = 0;
		Scanner sc1 = new Scanner(System.in);
		int count = 0;
		while (count<5) {
			int r1 = (int) Math.round(Math.random()*(10-1)+1);
			int r2 = (int) Math.round(Math.random()*(10-1)+1);	
			System.out.println("How much is "+ r1 + " times " +r2+"?");
			int a1 = sc1.nextInt();
			if (a1==r1*r2) {
				score+=1;
				
			}
			count+=1;
		}
		System.out.println(score+ " answers out of 5 are correct.");
	}
	
	public static int divide(int m, int n) {
		int a2=0;
		while (m>=n){
			m-=n;
			a2+=1;
		}
		return a2;
	}
	
	public static int modulus(int m, int n) {
		int a3 = m-(n*divide(m,n));
		return a3;
	}
	
	public static int countDigits(int n) {
		if (n<0){
			return 0;
		}
		int a4=1;
		while (n>=10) {
			n=n/10;
			a4+=1;
		}
		
		return a4;
	}
	
	public static int position(int n, int digit) {
		int pos =1;
		String nstr = Integer.toString(n);
		for (int i=0; i<nstr.length(); i++){
			if(nstr.charAt(i) - '0'==digit) {
				return pos;
			}
			else {
				pos+=1;
			}
		}
		return -1;
	}
	
	public static long extractOddDigits(long n) {
		String extraction ="";
		String nstr = Long.toString(n);
		for (int i=0; i< nstr.length(); i++){
			if( (nstr.charAt(i) - '0') %2 ==1 ) {
				extraction = extraction+nstr.charAt(i);
			}		
		}
		if (extraction=="") {
			return (long) -1;
		}
		else {
			return Long.parseLong(extraction);
		}
	}
	
}