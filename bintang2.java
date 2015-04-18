public class bintang2 {
public static void main(String args[]) {

for(int b=1; b<=7; b++)
    {
        for(int k=1; k<=7; k++)
            {
                if (b==1||b==7||k==1||k==7)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
        System.out.println("");
    }
}
}