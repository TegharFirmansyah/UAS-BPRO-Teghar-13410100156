import java.util.*;
	public class BentukAir {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner (System.in);
				System.out.println("Enter Suhu =");
				int air=sc.nextInt();
				
				if(air<=0){
				System.out.print("Bentuk air padat");
				}
				if((air<=100)&&(air>=0)){
				System.out.println("Bentuk air cair");
				}
				
				if(air>=100){
				System.out.println("Bentuk air gas");
				}
				
				
				System.out.println("\n Berhasil");
				
		}
	}
				