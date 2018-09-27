package loan;
/**
 * The LoanMonthlyPayment class calculates the monthly payment needed to pay off a loan. The class API is
 * based on a purchase amount and a down payment. Internally, the class calculates the amount to be financed by
 * the loan as the purchase amount less the down payment.
 * 
 * @author Ray
 */
public class LoanMonthlyPayment {
    
    private double purchaseAmount;
    private double downPayment;
    private double apr;
    private double years;
    /**
     * Default constructor set variables to 0
     */
    public LoanMonthlyPayment() {     
        purchaseAmount = 0;
        downPayment = 0;
        apr = 0;
        years = 0;
    }
    /**
     * The class constructor creates a LoanMonthlyPayment object configured to calculate a loan payment. Two
     * constructors are required, one that does not accept parameters, and one that does. Where no parameters are used,
     * the “set” methods must be used to store loan parameters within the resulting object. Where parameters are used,
     * the loan parameters are provided to the object through the constructor. 
     * 
     * @param purchaseAmount the amount of the purchase to be made by the borrower.
     * @param downPayment the down payment to be made by the borrower against the purchase amount.
     * @param apr the annual percentage rate (APR) to be applied to the loan.
     * @param years the duration of the loan in years.
     */
    public LoanMonthlyPayment(double purchaseAmount, double downPayment, 
            double apr, double years) {
        this.purchaseAmount = purchaseAmount;
        this.downPayment = downPayment;
        this.apr = apr;
        this.years = years;
    }
    
    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    
    }
    
     public void setAPR(double apr) {
         this.apr = apr;
    }
     
    public void setYears(double years) {
        this.years = years;
    }
    
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    
    public double getDownPayment() {
        return downPayment;
    }
    
    public double getAPR() {
        return apr;
    }
    
    public double getYears() {
        return years;
    }
    
    public double calcMonthlyPayment() {
        return 0;
    }
}
