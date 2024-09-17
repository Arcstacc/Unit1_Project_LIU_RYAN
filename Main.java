import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        // Decimal formating for money values
        DecimalFormat dc1 = new DecimalFormat("###.00");



        // Start with the story
        // Init variables that look nice

        Date currentDate = new Date();
        System.out.println("Current date and time: " + currentDate);

        String restaurantName = "Hon Hon Hon Fancy Dining";
        final String ADDRESS = "7818 Extortion Avenue";
        final String RESTURANT_NUMBER = "929-311-4592";
        final String MERCHANT_ID = "HIGH_1827Hb";
        final String ENDING_SIGN = "Thanks for supporting us!\nTHANK YOU";
        String status = "Approved";
        String seperation1 = "----------------------------";

        // Init variables for caluulations
        int numberOfPeople;
        double subTotal;
        double tipPercentage;
        double totalTip;
        double finalBill;
        double billPerPerson;
        double tipPerPerson;

        // Ask for input information
        // Scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your Bill (S): ");
        String tempsubTotal = s.nextLine();
        subTotal = Double.parseDouble(tempsubTotal);

        System.out.print("Tip Percent: ");
        String tempTipPercentage = s.nextLine();
        tipPercentage = Double.parseDouble(tempTipPercentage) / 100;

        System.out.print("Number of People: ");
        String tempNumberOfPeople = s.nextLine();
        numberOfPeople = Integer.parseInt(tempNumberOfPeople);

        
        // Calculations
        totalTip = tipPercentage * subTotal;
        finalBill = totalTip + subTotal;
        tipPerPerson = totalTip / numberOfPeople;
        billPerPerson = finalBill / numberOfPeople;


        System.out.println(restaurantName);
        System.out.println(ADDRESS);
        System.out.println(RESTURANT_NUMBER);
        System.out.println();
        System.out.println(currentDate);
        System.out.println("Merchant ID: " + MERCHANT_ID);
        System.out.println("Response: " + status);
        System.out.println("Sub Total: USD$ " + subTotal);
        System.out.println("Tip: USD$ " + totalTip);

        System.out.println(seperation1);
        System.out.println("Total bill: USD$ " + finalBill);
        System.out.println("Tip per person: USD$ " + tipPerPerson);
        System.out.println("Bill per person: USD$ " + billPerPerson);


        System.out.println();
        System.out.println();
        System.out.println(ENDING_SIGN);






    }
}
