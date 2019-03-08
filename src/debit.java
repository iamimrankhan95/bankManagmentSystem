import java.util.ArrayList;

//package bank.account;
class debit extends account{
public static double max_balance=100000;
public static double daily_trans=20000;
public debit(){
	
}
public debit(String n,String p_DOB,String nom,double bal){
name=n;
ID=StaticIdGenerator.IDGENERATOR.generate();
DOB=p_DOB;
nominee=nom;
balance=bal;

}
public  boolean deposit(double amount){
	           if(balance<=max_balance){
	           balance=balance+amount;
	           return true;
	           }
           else {
        	  return  false;
        	   }
          }
  public  boolean withdraw(double amount){
          if(amount<=balance && amount<=daily_trans){
        	  balance=balance-amount;
               return true;
            }
          else 
        	  {return false;}
        }
		public  void printAccount(){
			
			System.out.println("Account information:");
			System.out.println("Person's Name: "+name);
			System.out.println();
			System.out.println("Person's ID: "+ID);
			System.out.println();
			System.out.println("Peron's DOB: "+DOB);
			System.out.println();
			System.out.println("Person's nominee: "+nominee);
			System.out.println();
			System.out.println("Person's balance: "+balance);
			System.out.println();
			}
		public String toString(){
			return String.format(name+ " "+ID+" "+DOB+" "+nominee+" "+balance);
		}
}
