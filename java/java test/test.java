import java.util.Scanner;
public class test{
    /* subclass of type animal
     * means everything in Animal available in here as well
    */
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);

   

    public static void main(String[] args){
        //System.out.print("Hello World! ==>");
        //String input = sc.next();
        //int input = sc.nextInt();
        //double input = sc.nextDouble();
        //char input = sc.next().charAt(0);
        //System.out.print(input); 
    
        //System.out.printf("%-5.2f", 19.779);
        //System.out.printf("%-4.2f", 19.779);
        String stringA = " Wild ";

        String stringB = " Irish ";

        String stringC = " Rose ";

        String result = stringA.trim() + stringB + stringC.trim();
        System.out.print("start:" + result + ":end");
        

    }
}

