package day_4;

class FixedAmount{//concrete class
	public int  fixedamount=10000;
}
abstract class Withdrawal{//abstract class
	abstract void withdraw(int amount);//method
}
public class Bank_chat extends Withdrawal {
	FixedAmount f1=new FixedAmount();
	
	 void withdraw(int amount) {
		 f1.fixedamount -=amount;
		 System.out.println("withdrawn: "+amount);
		 System.out.println("Available Balance: " +f1.fixedamount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int amount=Integer.parseInt(args[0]);
      Bank b=new Bank();
      b.withdraw(amount);
	}

}
