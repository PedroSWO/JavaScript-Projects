public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int dowPayment = 2000;

// Evaluate the two expresions if they're true.....
  if(loanLength <=0 || interestRate <= 0 ){
     System.out.println("Error! You must take out valid car loan.");
    }else if(dowPayment >= carLoan){
      System.out.println("The car can be paid in full.");
    }else{
      // If the none of the previous expressions evaluate to true
      // Calculate the final monthly payment
      int remainingBalance = carLoan - dowPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRate / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }
	}
}