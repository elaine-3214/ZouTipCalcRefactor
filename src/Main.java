import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group: ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the tip percentage (0-100): ");
        int tip = scan.nextInt();
        scan.nextLine();

        //new tip calc
        TipCalculator tipCalc = new TipCalculator(people, tip);

        //dish info
          double dish = 0.0;
          while (dish != -1)  //while loop
        {
            System.out.print("Enter the dish price, e.g. 10.50 (-1 to end): ");
            dish = scan.nextDouble();
            if (dish != -1) {
                tipCalc.addMeal(dish);
            }
        }
        System.out.println("---------------------------------------");

        // calculations
        double dishTotal = tipCalc.getTotalBillBeforeTip();
        String formatteddishTotal = formatter.format(dishTotal);
        int tipPercentage = tipCalc.getTipPercentage();
        String formattedtipPercentage = formatter.format(tipPercentage);
        double totalTip = tipCalc.tipAmount();
        String formattedtotalTip = formatter.format(totalTip);
        double totalBill = tipCalc.totalBill();
        String formattedtotalBill = formatter.format(totalBill);
        double personBeforeTip = tipCalc.perPersonCostBeforeTip();
        String formattedpersonBeforeTip = formatter.format(personBeforeTip);
        double tipPerPerson = tipCalc.perPersonTipAmount();
        String formattedtipPerPerson = formatter.format(tipPerPerson);
        double costPerPerson = tipCalc.perPersonTotalCost();
        String formattedcostPerPerson = formatter.format(costPerPerson);

        //finals
        System.out.println("Your total bill before tip is: $"+ formatteddishTotal);
        System.out.println("The tip percentage is: "+ formattedtipPercentage);
        System.out.println("Your total tip is: $"+ formattedtotalTip);
        System.out.println("Your total bill after tip is: $"+ formattedtotalBill);
        System.out.println("Per person cost before tip is: $"+ formattedpersonBeforeTip);
        System.out.println("Per person tip is: $"+ formattedtipPerPerson);
        System.out.println("Total cost per person: $" + formattedcostPerPerson);


    }
}
