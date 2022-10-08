 public class TipCalculator {

    //instance variables
    private int numPeople;
    private int tipPercentage;
    private double totalBillBeforeTip;

    //constructor
    public TipCalculator (int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    //methods

    //get bill before meal
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    // get tip percentage
    public int getTipPercentage() {
        return tipPercentage;
    }

    //add meal
    public void  addMeal (double cost) {
        totalBillBeforeTip += cost;
    }

    // tip amount
    public double tipAmount() {
        return (((double)tipPercentage)/100)*totalBillBeforeTip;
    }

    //total bill
    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    //per person before tip
    public double perPersonCostBeforeTip () {
        return totalBillBeforeTip / numPeople;
    }

    //per person tip
    public double perPersonTipAmount () {
        return tipAmount() / numPeople;
    }

    //per person total
    public double perPersonTotalCost() {
        return totalBill() / numPeople;
    }
}
