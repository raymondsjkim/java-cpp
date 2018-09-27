package loan.test;
import java.util.Scanner;
import loan.LoanMonthlyPayment;
/**
*
* @author Ray
*/
public class LoanTest {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        LoanMonthlyPayment loan = new LoanMonthlyPayment();
        
        System.out.println("LoanMonthlyPayment Testing\n");
        
        System.out.print("Enter purchase amount: ");
        loan.setPurchaseAmount(input.nextDouble());
        
        System.out.print("Enter downpayment amount: ");
        loan.setDownPayment(input.nextDouble());
                
        System.out.print("Enter APR (%): ");
        loan.setAPR(input.nextDouble());
        
        System.out.print("Enter loan duration (years): ");
        loan.setYears(input.nextDouble());  
        
        System.out.println("Monthly payment: " + loan.calcMonthlyPayment());   
        
    }
}
