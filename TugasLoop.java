import java.util.*;
public class TugasLoop
{
public static void main (String [] argx) {
	Scanner sc=new Scanner(System.in);
	System.out.print("masukkan jumlah angka:");
	int jml=sc.nextInt();
	int bil=0;
	int c=1;
	int total=0;
	int max=0;
	while(c<=jml){
		System.out.print("Input angka ke - "+ c +":");
		bil=sc.nextInt();
		total +=bil;
		if(max<bil)
			max=bil;
		c++;
		}
	System.out.println("Total angka = " +total);
	System.out.println("Rata-rata dari jumlah angka diatas = " +max);
	
}
}