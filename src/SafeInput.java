import java.util.Scanner;

public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You entered an invalid number: " + trash);
            }
            
        }while(!done);

        return retInt;
    }


}
