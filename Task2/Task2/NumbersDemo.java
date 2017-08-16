public class NumbersDemo {
    public static void main(String[] args) {
        int numberOne = 15;
        int numberTwo = 3;
        displayTwiceTheNumber(numberOne);
        displayTwiceTheNumber(numberTwo);
        displayTheNumberPlusFive(numberOne);
        displayTheNumberPlusFive(numberTwo);
        displayTheNumberSquared(numberOne);
        displayTheNumberSquared(numberTwo);
    }
    public static void displayTwiceTheNumber(int number){
        System.out.println("Double " + number + " is " + (number*2));
    }
    public static void displayTheNumberPlusFive(int number){
        System.out.println(number + " plus five is " + (number + 5));
    }
    public static void displayTheNumberSquared(int number){
        System.out.println(number + " squared is " + (number*number));
    }
}
