public class Promo{
	public static void main (String []args){
		int Harga =2000;
		int Barang =60;
		int Bonus = Barang/2;
		int Promo = Barang + Bonus;
		int TotalHarga = Barang * Harga;
			System.out.println("Barang /unit :" + Barang);
			System.out.println("Total Barang + Bonus (beli 2 gratis 1) :" + Promo);
			System.out.println("Harga /unit :" + Harga);
			System.out.println("Total Harga (unit pokok) :" + TotalHarga);
	}
}