package Inheritance;

import java.util.Random;

//Parent class
public class LoanProcess {
protected long customerid;
protected String customername;
protected double loanamount;
protected int term;
protected static double interest = 8.5;


public String getCustomername()  {
	return customername;
}
LoanProcess() {
	customerid = new Random().nextLong();
}
public double calculateEMI() {
		return (loanamount * interest/100)/term;
	}
}