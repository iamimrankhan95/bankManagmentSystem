import java.util.Scanner;
public class BankIO {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		 bank b=new bank();
		 bank b1=new bank(){
			 public void printAccount(){
				 System.out.println("hyy");
			 }
		 };
		 String name,dob,nom;
		 double balance;
		 name=input.next();
		 dob=input.next();
		 nom=input.next();
		 balance=input.nextDouble();
		 b.createAccount(name,dob,nom,balance);
		 name=input.next();
		 dob=input.next();
		 nom=input.next();
		 balance=input.nextDouble();
		 b1.createAccount(name,dob,nom,balance);
		// b.printAccount("2016-02-00000");
		 b.printAccount();
		 b1.printAccount();
		 input.close();
	 	}
}
