import java.util.*;
public class Bintang3
{
	public static void main(String [] p){
	Scanner sc=new Scanner(System.in);
	System.out.print("Masukkan n:");
	int n=sc.nextInt();
	System.out.print("Masukkan m:");
	int m=sc.nextInt();
	
		int c=1;
		while (c<=n)
		{
			int d=1;
			while (d<=m)
			{
				 if (c==1||c==n||d==1
				 ||d==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
				d++;
			}
				System.out.println("");
				c++;
		}
	}
}