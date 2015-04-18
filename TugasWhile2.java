import java.util.*;
public class TugasWhile2{
	public static void main (String [] argx){
		Scanner sc=new Scanner (System.in);
		System.out.println ("Banyak soal :");
		int soal=sc.nextInt();
		int a=1;
		int b=1;
		String output="";
		System.out.println ("Soal Penjumlahan");
		System.out.println ("No. \tSoal \tJawaban"); 

		while(a<soal+1){
			int x=(int)(Math.random()*50);
			int y=(int)(Math.random()*50);
			int kunci=x+y;
			System.out.print (a+").\t"+x+"+"+y+"=");
			int jawaban=sc.nextInt();
			output +="\n"+a+").\t"+jawaban+"\t"+kunci+"\t"+((jawaban==kunci)?"Benar" : "Salah");
			a++;
		}
				System.out.println ("Hasil kuis:");  
				System.out.println ("\nNo."+"\tJawaban"+"\tKunci"+"\tStatus");  
				System.out.println (output);
				System.out.println(" Selamat");
				System.out.println(" Belajar Lebih Giat Lagi");
	}
}
