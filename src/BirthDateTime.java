import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950,2015);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1,12);
        int birthDay = 0;
        switch(birthMonth)
        {
            case 1, 3, 5, 7, 8, 10, 12:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1,31);
                break;

            case 2:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1,28);
                break;

            case 4, 6, 9, 11:
                birthDay = SafeInput.getRangedInt(in, "Enter your birth day", 1,30);
                break;
        }
        int birthHour = SafeInput.getRangedInt(in, "Enter your birth hour in military time", 1,24);
        int birthMinute = SafeInput.getRangedInt(in, "Enter the minute of your birth", 0,59);

        System.out.println("You said you were born in " + birthYear + " in the month of " + birthMonth + " on the day " + birthDay + " at " + birthHour + " hours and " + birthMinute + " minutes.");



    }
}


