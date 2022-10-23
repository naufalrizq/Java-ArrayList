
/**Algoritma
* 1.Meminta n sebagai ukuran deret poin peserta.
* 2.Selama poin peserta bukan -1 dan besar poin peserta <= n, maka program akan meminta
    poin.
* 3.Terdapat tier1, tier2, dan tier3.
* 4.Baca semua poin peserta satu-persatu.
    -  Jika ditemukan poin 0-4, maka tambahkan nilai tier1 dengan "".
    -  Jika ditemukan poin 5-9, maka tambahkan nilai tier2 dengan "".
    -  Jika ditemukan poin 10, maka tambahkan nilai tier3 dengan "*".
* 5.Cetak tier1, tier2, dan tier3.
*/
import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int bilbul = s.nextInt();
		int[] bilangan = new int[bilbul];
		int t1 = 0;
		int t2 = 0;
		int t3 = 0;

		for (int B = 0; B < bilangan.length; B++) {
			bilangan[B] = s.nextInt();
			if (bilangan[B] >= 0 && bilangan[B] <= 4) {
				t1++;
			} else if (bilangan[B] >= 5 && bilangan[B] <= 9) {
				t2++;
			} else if (bilangan[B] == 10) {
				t3++;
			}
		}
		System.out.print("Tier 1 :");
		for (int B = 0; B < t1; B++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Tier 2 :");
		for (int B = 0; B < t2; B++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.print("Tier 3 :");
		for (int B = 0; B < t3; B++) {
			System.out.print("*");
		}
	}
}
