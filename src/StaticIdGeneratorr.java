import java.util.Calendar;
 import java.util.Scanner;
    class StaticIdGenerator{
			 private static int serialNo=0;
			 private static int monthFlag=0;
			 public static class IDGENERATOR{
							 public static String generate(){
						  Calendar cal = Calendar.getInstance();
						  if(monthFlag<cal.MONTH){
							  monthFlag=cal.MONTH;
							  serialNo=0;
						  }
							 return String.format("%d-%02d-%05d",(cal.YEAR+2015),(cal.MONTH+1),serialNo++); 
					  }
			 }
		
		}
//   
//   
// 	public class StaticIdGeneratorr{
// 		public static void main (String args[]){
//			
//			//StaticIdGenerator.serialNo=0;
// 			//StaticIdGenerator outer=new StaticIdGenerator();
// 			StaticIdGenerator.IDGENERATOR obj=new StaticIdGenerator.IDGENERATOR();
// 			StaticIdGenerator.IDGENERATOR obj2=new StaticIdGenerator.IDGENERATOR();
// 			System.out.println(obj.generate(1));
// 			System.out.print(obj2.generate(14));
// 		}
 //	}
 	
   
