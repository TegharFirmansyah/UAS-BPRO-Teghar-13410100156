import java.util.*;
public class DoWhile1
{
	public static void main (String [] args) {
	Scanner sc=new Scanner(System.in);
	int angka=0;
	int total=0;
	
	do
	{
		System.out.println("masukkan angka [999=exit]=");
		angka = sc.nextInt();
		total +=angka;
	}while(angka !=999);
	System.out.println("total="+total);
}
}