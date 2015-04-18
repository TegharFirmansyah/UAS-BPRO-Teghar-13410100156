public class VarSwapper{
	public static void main (String []rgs){
	int a=50;
	int b=20;
	System.out.println("a="+a);
	System.out.println("b="+b);
	System.out.println();
	System.out.println("niali var 'a' dipindah ke variabel 'b'");
	System.out.println("dan nilai var 'b' pindah ke var 'a' ");
	System.out.println();
	 a += b;//a=a+b
	 b = a-b;
	 a -= b;//a=a-b
	System.out.println("var 'a'="+a);
	System.out.println("var 'b'="+b);
	
	}
}