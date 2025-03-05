import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String socialSecurity = SafeInput.getRegExString(in,"Enter your social security number", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your social security number is: " + socialSecurity);

        String studentNumber = SafeInput.getRegExString(in, "Enter your student number", "^(M|m)\\d{5}$");
        System.out.println("Your student number is: " + studentNumber);
        
        String menuChoice = SafeInput.getRegExString(in, "O - Open   S - Save   V - View   Q - Quit", "^[OoSsVvQq]$");
        System.out.println("You chose: " + menuChoice);



    }
}

