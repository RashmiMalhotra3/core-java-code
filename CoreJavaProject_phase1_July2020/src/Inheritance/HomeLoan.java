package Inheritance;

//child class 1
public class HomeLoan extends LoanProcess{
	private String postalcode;
	
	//constructor 
	 HomeLoan(String nme, double amount, int tm, String pc){
		 customername = nme;
		 loanamount = amount;
		 term = tm;
		 postalcode = pc;
	 }
	 
	 //overriding
	 public String getCustomername() {
		 return "Customer "+customername+" looking to buy a property in area :"+ postalcode;
	 }
	 
	 //overloading
	 public double calculateEMI(String scheme) {
		 if (scheme == "fixed") {
			 System.out.println("Calculating fixed interest EMI");
			 return ((loanamount * interest/100)+(loanamount/term)); 
		 }
		 else {
			 System.out.println("For floating interest, EMI varies depending on the current bank interest");
			 System.out.println("Please call us at 1-800-Bank-Loan");
			 return 0.0;
		 }
	 }
}