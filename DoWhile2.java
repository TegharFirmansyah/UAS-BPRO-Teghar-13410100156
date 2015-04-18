import java.util.*;
public class DoWhile2
{
	public static void main (String [] args) {
	boolean selesai = false;
	Scanner sc=new Scanner(System.in);
	int angka=0;
	int total=0;
	
	do
	{
		System.out.println("masukkan angka [-1=exit]=");
		angka = sc.nextInt();
		if (angka== -1)
			selesai=true;
		else
		total +=angka;
	}while(!selesai);
	System.out.println("total="+total);
}
}