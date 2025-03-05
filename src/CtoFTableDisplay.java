public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double cToFTable = CtoF(-100);

    }

    public static double CtoF(double celsius)
    {
        double fahrTemp = 0;
        double celsTemp = -100;

        System.out.println("Celsius    Fahrenheit");

        for(celsTemp = -100; celsTemp <= 100; celsTemp += 1.0)
        {
            fahrTemp = celsTemp * 9/5 + 32;
            System.out.printf("%6.2f %12.2f \n ", celsTemp, fahrTemp);

        }

    return fahrTemp;
    }


}