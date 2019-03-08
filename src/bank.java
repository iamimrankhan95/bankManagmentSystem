import java.util.*;
class bank {
	public bank(){
		System.out.println("hellow");
	}
	protected static int  accSerial=0;
	 //account []accountList=new account [100];
	 //vector<account> accountList=new vector(3,2);
	 Vector<account> accountList = new Vector<account>();//The Vector only stores a reference to the object, not the object itself.

	public void createAccount(String n,String dob,String nom,double balance){
//		if(x==0){
//			for(int i=0;i<100;i++){
//				accountList[i]=new debit();
//			}
//			x=1;
//		}
		accountList.addElement(new debit(n,dob,nom,balance));
//		accountList[accSerial]=new debit();
//		this.accountList[accSerial].name=n;
//		
//		this.accountList[accSerial].DOB=dob;
//		this.accountList[accSerial].nominee=nom;
//		this.accountList[accSerial].balance=balance;
//		this.accountList[accSerial].ID=StaticIdGenerator.IDGENERATOR.generate();
		accSerial++;
		//input.close();
		//accountList.add
	}
		public void deposit(String ID , double amount){
			
		}
		public void withdraw(String ID,double amount){
			
		}
		public  void printAccount(){
//			for(int s=0;s<accSerial;s++){
//				System.out.println(this.accountList[s]);
//			}
			
			/*
			Enumeration<account> vEnum = accountList.elements();
		   //   System.out.println("\nElements in vector:");
		      while(vEnum.hasMoreElements())
		         System.out.println(vEnum.nextElement());
		      System.out.println();
		      */
			for(account x: accountList){
				System.out.println(x);
			}
			
		}
		public  void printAccount(String ID){
			for(int id=0;id<accountList.length;id++){
				if(ID.equals(accountList[id].ID)){
					System.out.println("Account information:");
					System.out.println("Person's Name: "+accountList[id].name);
					System.out.println();
					System.out.println("Person's ID: "+accountList[id].ID);
					System.out.println();
					System.out.println("Peron's DOB: "+accountList[id].DOB);
					System.out.println();
					System.out.println("Person's nominee: "+accountList[id].nominee);
					System.out.println();
					System.out.println("Person's balance: "+accountList[id].balance);
					System.out.println();
				}
			}
	
	}
}


