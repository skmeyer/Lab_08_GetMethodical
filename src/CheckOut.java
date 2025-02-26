import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean continueYN = true;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.5,10.0);
            continueYN = SafeInput.getYNConfirm(in,"Would you like to enter the price of another item?");
            totalPrice = itemPrice + totalPrice;
        }while(continueYN);

        System.out.println("The price of your items is: ");
        System.out.printf("%.2f", totalPrice);


    }
}
