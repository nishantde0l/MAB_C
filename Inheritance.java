package boi.com;

class account{
	String name= "Nishant";
	int AccountNumber=12345;
	int balance=100000000;
	
	public void display()
	{
		System.out.println("\n Emp name:" + name + "\n Account number:" + AccountNumber + "\n Account balance" + balance);
	}

}

class LoanAccount extends account
{
	//Account a=new Account();
	int LoanAmount=1000;
	
	public void DisplayLoan()
	{
		int AailableBalance = balance - LoanAmount;
		System.out.println("\n Available banlance:" + AailableBalance);
	}
}




public class Inheritance {
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LoanAccount emp1= new LoanAccount();
		emp1.display();
		emp1.DisplayLoan();
		
	}

}
