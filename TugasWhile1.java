import java.util.*;
public class TugasWhile1{
  public static void main(String [] argc){
    Scanner a=new Scanner(System.in);
    System.out.println("Masukkan Jumlah Loop n: ");
    int n=a.nextInt();
    System.out.println("Masukkan Jumlah Loop m: ");
    int m=a.nextInt();
    int x=1;
    int y=1;
    int z=1;
		while (x<=n){
			while(z<=m){
			System.out.print(y+" \t");
			y++;
			z++;
			}
			System.out.println(" ");
			x++;
			z=1;
		}
	}	
}