
abstract  class account{
protected  String name;
protected  String ID;
protected  String DOB ;
protected  String nominee;
protected  double balance;

public account(){
	
}
public account(String n,String p_DOB,String nom,double bal){
	name=n;
	//ID=StaticIdGenerator.IDGENERATOR.generate(1);
	DOB=p_DOB;
	nominee=nom;
	balance=bal;

}
public String toString(){
	return String.format(name+ " "+ID+" "+DOB+" "+nominee+" "+balance);
}
abstract  boolean deposit(double amount);
abstract  boolean withdraw(double amount);
abstract  void printAccount();

}

