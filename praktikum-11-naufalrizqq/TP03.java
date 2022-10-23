
/**Algoritma
 * 1.Meminta inputan (n)sebagai banyaknya jumlah angka yang mau dimasukkan,dan angka selanjutnya adalah deretan angka yang dicari modusnya
 * 2.Membuat variabel (n) yang akan digunakan sebagai jumlah elemen dari array yang akan dibuat
 * 3.Membuat array dengan nama (angka) 
 * 4.Membuat perulangan yang berfungsi sebagai inputan untuk memasukkan data (nama) ke dalam array
 * 5.Membuat method cariMin untuk mencari nilai terkecil,jika min > angka [i] cetak angka
 * 6.Membuat method cariMax untuk mencari nilai terbesar,jika max < angka [i] cetak angka
 * 7.Membuat variabel Avg untuk mencari nilai rata rata,sum ditambah angka [i] lalu inisialisasi variabel desimal sama dengan elemen lalu avg adalah sum dibagi desimal
 * 8.Panggil masing masing method kedalam kelas main,khusus untuk avg pada saat print menggunakan decimal format
 * 9.Cetak hasil
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		double sum = 0;
		int elemen = s.nextInt();
		int[] angka = new int[elemen];
		// Input data ke dalam array
		for (int i = 0; i < angka.length; i++) {
			angka[i] = s.nextInt();
		}
		int min = cariMin(angka);
		int max = cariMax(angka);

		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

		for (int i = 0; i < angka.length; i++) {
			sum = sum + angka[i];
		}

		double decimal = elemen;

		double avg = sum / decimal;

		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Avg: " + df.format(avg));

	}

	private static int cariMin(int[] angka) {
		int min = angka[0];
		for (int i = 1; i < angka.length; i++) {
			if (min > angka[i]) {
				min = angka[i];
			}
		}
		return min;
	}

	private static int cariMax(int[] angka) {
		int max = angka[0];
		for (int i = 1; i < angka.length; i++) {
			if (max < angka[i]) {
				max = angka[i];
			}
		}
		return max;
	}

}
