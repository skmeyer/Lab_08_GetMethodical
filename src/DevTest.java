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
    }
}
