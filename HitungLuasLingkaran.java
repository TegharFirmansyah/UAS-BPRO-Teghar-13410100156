public class HitungLuasLingkaran{
	public static final float PHI=22.0f/7.0f;// (f) digunakan untuk mengetahui bahwa bilangan tersebut FLOAT
	public static void main(String []args)
	{
		float radius= 3.0f;
		float luas= PHI*(radius*radius);
		
		System.out.println("Luas Lingkaran =" + luas);
	}
}