
class savings extends account{
	public savings(){}
	public savings(String n,String p_DOB,String nom){
		name=n;
		ID=StaticIdGenerator.IDGENERATOR.generate();
		DOB=p_DOB;
		nominee=nom;

		}
	
	public  boolean deposit(double amount){
		if(amount<=balance){
			balance=balance+amount;
			return true;
		}
		else return false;
		
	}
	public  boolean withdraw(double amount){
	if(amount<=balance){
		balance=balance-amount;
	return true;
	}
	else return false;
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
	
}