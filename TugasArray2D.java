import java.io.*;
public class TugasArray2D{
  public static int []hitungbaris(int [][]data){
			int []jumlahbaris=new int[data[0].length];
			int m;
			int n;
			for (m=0;m<data[0].length;m++){
			  for(n=0;n<data.length;n++){
				jumlahbaris[m]+=data[n][m];
			  }
			}
			  for(n=0;n<data.length;n++){
				System.out.println("Total Baris "+n+" :"+jumlahbaris[n]);
			  }
			return(jumlahbaris);
		  }
		  public static int []hitungkolom(int [][]data){
			int []jumlahkolom=new int[data.length];
			int m;
			int n;
			for (m=0;m<data.length;m++){
			  for(n=0;n<data[0].length;n++){
				jumlahkolom[m]+=data[m][n];
			  }
			}
			for (m=0;m<data[0].length;m++){
				System.out.println("Total Kolom "+m+" :"+jumlahkolom[m]);
			  }
			return(jumlahkolom);
			}
		  public static int total(int [][]data){
			int m;
			int n;
			int totalarray=0;
			for (m=0;m<data.length;m++){
			  for(n=0;n<data[0].length;n++){
				totalarray+=data[m][n];
			  }
			}
			System.out.println("Total: "+totalarray);
			return(totalarray);
		  }
		  public static void main (String []args)throws IOException{
		  BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		  int m=0;
		  int n=0;
		  System.out.print("Kolom: ");
		  int kol=Integer.parseInt(br.readLine());
		  System.out.print("Baris: ");
		  int bar=Integer.parseInt(br.readLine());
		  int [][]data=new int [bar][kol];
		  for(m=0;m<kol;m++){
			for (n=0;n<bar;n++){
			System.out.print("Masukkan Data ke ["+m+"]"+" ["+n+"]: ");
			data [m][n]=Integer.parseInt(br.readLine());
			}
		  }
		  hitungkolom(data);
		  hitungbaris(data);
		  total(data);
  }
}