// Jackson Blair
package compound.interest;
import javax.swing.JOptionPane;
public class CompoundInterest 
{
     public static void main(String[] args) 
    {
       // String is the variable for the dialog input box, Double is the number variable
       String dialogInput;
       String dialogInput2;
       double deposit;
       double interestRate;
       double monthlyInterest;
       double balance;
       int monthsPassed;
       double wholeInterest;
       double balanceTwo;
       double totalBalance;
       int monthsPassedMinusOne;
       double divideByRate;
       double depTimesBalance;
       double depTimesBalanceTwo;
       
       // This gets the starting balance and converts it to a double variable
       dialogInput =  JOptionPane.showInputDialog ("How much would you like to deposit?");
       deposit = Double.parseDouble(dialogInput);
       
       // This gets the interest rate and divides by 100 to get a workable percentage
       dialogInput2 = JOptionPane.showInputDialog ("What is your interest rate?");
       interestRate = Double.parseDouble(dialogInput2)/100;
       monthlyInterest = interestRate/12;
       
       //This gets how many months the user intends to contribute the same amount 
       dialogInput =  JOptionPane.showInputDialog ("How many months will you contribute the same amount?");
       monthsPassed = Integer.parseInt(dialogInput);
       
       // Found the Math.pow through google, not sure how you want it cited
       // Calculates the interest gains month over month for 6 months using a slightly modified version of the formula A=P(1+r)^t 
       // Balance = P(1+r)^t +c[((1+r)^t-1)/r]
       /* 
            P = deposit 
            r = monthlyInterest
            t = monthsPassed 
            c = deposit
            1+r = wholeInterest
            t-1 = monthsPassedMinusOne
       */
       
       wholeInterest=monthlyInterest+1;
       monthsPassedMinusOne = monthsPassed-1;
     
       
       balance = ((Math.pow(wholeInterest,monthsPassed)));
       balanceTwo =((Math.pow(wholeInterest,monthsPassedMinusOne)));
       divideByRate = balanceTwo / monthlyInterest;
       
       depTimesBalance = balance*deposit;
       depTimesBalanceTwo = balance*divideByRate;
       
       totalBalance=depTimesBalance + depTimesBalanceTwo;
       
        System.out.println(""+totalBalance);
        
        // these output to test that my interest rates are correct
        System.out.println(""+balance);
        System.out.println(""+balanceTwo);
             
       
       
    }
     
}
