
/**Algoritma
 * 1.Meminta inputan bilangan bulat yang dinyatakan sebagai jumlah peserta lomba dan inputan berikutnya adalah nilai dari setiap peserta lomba
 * 2.Membuat variabel(n) sebagai jumlah elemen dari array yang akan dibuat
 * 3.Membuat array nilai yang jumlah elemennya ditentukan dari (n)
 * 4.Membuat perulangan yang berfungsi sebagai input nilai dari setiap peserta lomba
 * 5.Menggunakan sort untuk mengurutkan nilai secara descending
 * 6.Cetak hasil
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer[] nilai = new Integer[n];
		// Input data ke dalam array
		for (int i = 0; i < nilai.length; i++) {
			nilai[i] = s.nextInt();
		}
		Arrays.sort(nilai, Collections.reverseOrder());
		for (int angka : nilai) {
			System.out.print(angka + " ");
		}

	}
}
