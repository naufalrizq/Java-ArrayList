
/**Algoritma
 * 1.Meminta masukkan barisan inputan,baris pertama berisi jumlah peserta,baris berikutnya berisi nama-nama yang akan diacak dan jumlahnya sesuai dengan inputan(n)
 * 2.Membuat variabel (n) sebagai inputan barisan yang akan digunakan sebagai jumlah elemen
 * 3.Membuat array dengan variabel nama dan jumlah elemennya ditentukan dari inputan variablel(n)
 * 4.Membuat perulangan yang berfungsi sebagai inputan untuk memasukkan data (nama) ke dalam array
 * 5.Mengacak nama yang telah diinput dengan menggunakan random
 * 6.Cetak hasil
 */

import java.util.Random;
import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] nama = new String[n];
		// Input data ke dalam array
		for (int i = 0; i < nama.length; i++) {
			nama[i] = s.next();
		}
		Random r = new Random();
		int acak = r.nextInt(nama.length);
		System.out.println(nama[acak]);

	}
}
