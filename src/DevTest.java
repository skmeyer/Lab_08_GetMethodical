import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String message = SafeInput.getNonZeroLenString(in, "Enter your message");
        System.out.println("Your message is: " + message);

        int number = SafeInput.getInt(in, "Enter a number");
        System.out.println("The number you entered is: " + number);

        double price = SafeInput.getDouble(in, "Enter the price of an item");
        System.out.println("Your item was: " + price);

        double numChoice = SafeInput.getRangedInt(in, "Enter a number", 1,100);
        System.out.println("Your number was: " + numChoice); // not sure why a valid number displays with a decimal, couldn't find a fix

        double priceChoice = SafeInput.getRangedDouble(in, "Enter a price", 1,100);
        System.out.println("Your price was: " + priceChoice);

        boolean yesNo = SafeInput.getYNConfirm(in, "Is the sky blue?");
        System.out.println("You chose: " + yesNo);

        String phoneRegEx = SafeInput.getRegExString(in, "Enter your phone number", "^\\d{3}-\\d{3}-\\d{4}$");
        System.out.println("Your phone number is: " + phoneRegEx);

    }

}
