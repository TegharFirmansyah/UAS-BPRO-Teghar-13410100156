import java.util.*;

public class OperasiArray1{
	public static void cetak(int []data){
		for(int i=0;i<data.length;i++){
			System.out.println("Data ke "+(i+1)+" : "+data[i]);
		}
	}
	public static int hitungTotal(int []data){
		int jumlah = 0;
		for(int j=0;j<data.length;j++){
			jumlah+=data[j];
		}
		return(jumlah);
	}
	public static int rataRata(int []data){
		int jumlah = 0;
		for(int j=0;j<data.length;j++){
			jumlah+=data[j];
		}
		return(jumlah/data.length);
	}
	public static int nilaiMax(int []data){
		int max = 0;
		for(int j=0;j<data.length;j++){
			if(data[j]>max){
			max=data[j];
			}
		}
		return(max);
	}
	public static int nilaiMin(int []data){
		int min = 10;
		for(int j=0;j<data.length;j++){
			if(data[j]<min){
			min=data[j];
			}
		}
		return(min);
	}
	public static void main (String [] args){
		int angka[] = {1,15,25,32,48,58,69,71,82,99,100};
		int total = hitungTotal(angka);
		double rataRata;
		j = rataRata(angka);
		int max = nilaiMax(angka);
		int min = nilaiMin(angka);
		cetak(angka);
		System.out.println();
		System.out.print("Total Data : "+total);
		System.out.println();
		System.out.print("Nilai Max : "+max);
		System.out.println();
		System.out.print("Nilai Min : "+min);
		System.out.println();
		System.out.print("Nilai RataRata seluruh data : "+rataRata);
	}
}