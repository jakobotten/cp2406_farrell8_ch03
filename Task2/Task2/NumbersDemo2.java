import java.util.Scanner;
public class NumbersDemo2 {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        numberOne = getNumberFromUser();
        numberTwo = getNumberFromUser();
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
    public static int getNumberFromUser(){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        number = input.nextInt();
        return number;
    }
}
