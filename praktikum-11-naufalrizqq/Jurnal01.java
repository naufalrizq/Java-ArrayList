
/**Algoritma
 * 1.Membuat scanner untuk menerima inputan
 * 2.Membuat array list dengan nama dataNama
 * 3.Jika nama yang diinput "-" maka akan berhenti inputannya
 * 4.Jika belum input "-" maka akan terus melanjutkan inputan
 * 5.Jika data nama kosong,cetak "Data Kosong"
 * 6.Merandom nama yang sudah diinput
 * 7.Cetak hasil
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int kocokNama;
		String nama;
		ArrayList<String> dataNama = new ArrayList<>();
		nama = s.nextLine();
		while (!nama.equals("-")) {

			dataNama.add(nama);

			nama = s.nextLine();
		}

		if (dataNama.isEmpty()) {
			System.out.println("Data kosong");
		} else {
			kocokNama = (int) (Math.random() * dataNama.size());
			System.out.println(dataNama.get(kocokNama));
		}
	}
}
