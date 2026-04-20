import java.util.Scanner;
// single line comment 
/* rrrrrr
 * rrrr
 * r
 */
public class Animal {
    public static final double FAVNUMBER = 1.6280;
    /* public means shared by everyone. 
    * static means this number shared by every "Animal" object created
    * final means constant, cannot be changed
    * double means can enter decimal places 
    * note: common to have finals defined with all uppercase */ 
    private String name;
    /* private means can be accessed only by other methods in class */
    private int weight;
    private boolean hasOwner = false;
    /* boolean is true or false */
    private byte age; 
    /* byte is value of -28 to 127 */
    private long uniqueID;
    /* long means -2 to -63, 2 to 63 */
    private char favouriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;
    /* protected means value can only be accessed by anything in this package */

    static Scanner userInput = new Scanner(System.in);
    /* scanner means allow us to accept user input */
    public Animal(){
        numberOfAnimals++;

        int sumOfNumbers = 5+1;
        System.out.println("5+1="+sumOfNumbers);
        /* print screen 
         * println appends a newline character ('\n') to output
         * compared to print which does not
        */
        System.out.print("Enter name: \n");
        
        //hasNextInt, hasNextFloat, hasNextDouble, hasNextBoolean, hasNextByte
        //nextInt, nextFloat, etc.
        
        if (userInput.hasNextLine()){
            /* if user enters a string. */
            this.setName(userInput.nextLine());
            /* this refers to  object created. in this case: theAnimal
             * nextLine actually gets data entered
            */
        }
        this.setFavouriteChar();
        this.setUniqueID();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public boolean isHasOwner(){
        return hasOwner;
    }
    public void setHasOwner(boolean hasOwner){
        this.hasOwner = hasOwner;
    }

    public byte getAge(){
        return age;
    }
    public void setAge(byte age){
        this.age = age;
    }

    public long getUniqueID(){
        return uniqueID;
    }
    public void setUniqueID(long uniqueID){
        this.uniqueID = uniqueID;
        System.out.println("unique ID set to: "+ this.uniqueID);
    }

    public void setUniqueID(){
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber)+1));
        /* Math.random generates double by default 
         * (long) means to convert to long
         * we call these primitive datatypes. long,double,int,boolean,
         * other types are objects
         * 
         * conversion from priimtive to string:
         * String stringNumber = Long.toString(maxNumber);
         * 
         * conversion from string to primitive:
         * int numberString = Integer.parseInt(stringNumber);
        */
        System.out.println("unique ID set to: "+ this.uniqueID);
    }

    public char getFavouriteChar(){
        return favouriteChar;
    }
    public void setFavouriteChar(char favouriteChar){
        this.favouriteChar = favouriteChar;
    }
    public void setFavouriteChar(){
        int randomNumber = (int) (Math.random() * 126)+1;
        /* getting random numbers representing characters so only use numbers from 1 to 127 */
        this.favouriteChar = (char) (randomNumber);

        if (randomNumber == 32){
            System.out.println("Favourite character set to Space");
        }else if (randomNumber == 10){
            System.out.println("Favourite character set to Newline");
        }else {
            System.out.println("Favourite character set to "+ this.favouriteChar);
        }

        if ((randomNumber > 97) && (randomNumber <122)){
            System.out.println("Favourite character is a lowercase letter");
        }

        if (((randomNumber > 97) && (randomNumber <122)) || ((randomNumber > 64) && (randomNumber <91)) ){
            System.out.println("Favourite character is a letter");
        }

        int whichisBigger = (50>randomNumber) ? 50 : randomNumber;
        /* if (50>randomNumber) True, whichisBigger = 50, else whichisBigger = randomNumber  */
        
        switch(randomNumber){
            case 8: 
                System.out.println("Favourite character set to backspace");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Favourite character set to backspace");
                break;
            
            default:
                System.out.println();
                break;
        }
    }

    public double getSpeed(){
        return speed;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }

    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        this.height = height;
    }

    protected static void countTo(int startingNumber){
        for(int i = startingNumber; i<=100; i++){
            if(i==90) continue; /* not necessary to write */

            System.out.println(i);
        }
    }

    protected static String printNumbers(int maxNumbers){
        int i = 1;

        while(i < (maxNumbers / 2)){
            System.out.println(i);
            i++;

            if(i==(maxNumbers/2)) break;

        }
        
        Animal.countTo(maxNumbers/2);

        return "End of printNumbers";
        
    }

    protected static void guessMyNumber(){
        int number;
        do{
            System.out.println("Guess Number up to 100");

            while (!userInput.hasNextInt()){
                String numberEntered = userInput.next();
                System.out.printf("%s is not a number\n", numberEntered);
                /* %s is where string is printed at, in this case numberEntered 
                 * %f for float or double, %.2f means 2 d.p., %d for byte/int/long
                */
            }

            number = userInput.nextInt();
            
        } while (number!=50); 
        /* do{} executes while number is not 50*/
    }

    public String makeSound(){
        return "Grrrr";
    }
    
    public static void speakAnimal(Animal randAnimal){
        System.out.println("Animal says " + randAnimal.makeSound());

    }

    public static void main(String[] args){
        /*where we call programs to  run */
        
        Animal theAnimals = new Animal();

        int[] favouriteNumbers = new int[20];;
        favouriteNumbers[0]=100;

        String[] stringArray = {"Random","Words","Here"};

        for(String word : stringArray){

            System.out.println(word);
        }
    

        String[][][] arrayName = {{ {"000"},{"100"},{"200"},{"300"} },
                                { {"010"},{"110"},{"210"},{"310"} },
                                { {"020"},{"120"},{"220"},{"320"} }};
                                

        for (int i=0; i< arrayName.length; i++){
            for (int j=0; j< arrayName[i].length; j++){
                for (int k=0; k< arrayName[i][j].length; k++){
                    System.out.print("| " + arrayName[i][j][k] + "");
                }
            }
            System.out.println("|");
        }

        //String[] cloneOfArray = Arrays.copyOf(stringArray,3);

        //System.out.println(Arrays.toString(cloneOfArray));
        //System.out.println(Arrays.binarySearch(cloneOfArray,"Random"));

    }

}