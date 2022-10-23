
/**Algoritma
 * 1.Meminta sederet bilangan bulat milik Dira yang diakhiri dengan -1
 * 2.Hapus -1 dari deret bilangan bulat milik Dira.
 * 3.Mengurutkan deret bilangan bulat tersebut dari yang terkecil ke yang terbesar.
 * 4.Membuat deret bernama angka unik untuk menyimpan angka unik.
 * 5.Membuat deret bernama jumlah angka untuk menyimpan jumlah angka yang unik tersebut.
 * 6.Terdapat temp sebagai penyimpanan angka sementara dengan nilai awal 0.
 * 7.Membaca bilangan bulat pada deret milik Dira.
 * 8.Setiap angka yang selesai dibaca, jalankan instruksi berikut:
    - Jika angka sama dengan temp, maka tambahkan nilai terakhir pada deret jumlah angka
      dengan 1.
    - Jika angka tidak sama dengan temp, maka tambahkan angka 1 pada deret jumlah angka dan
      dan tambahkan angka tersebut pada deret angka unik.
    - Ganti nilai pada temp dengan angka saat ini.
 * 9.Membuat deret jumlah angka terurut yang dihasilkan dari mengurutkan deret jumlah angka.
 * 10.Mengambil angka terbesar dari deret jumlah angka dengan cara mengambil angka terakhir
    dari deret jumlah angka terurut.
 * 11.Mencari letak angka terbesar dari deret jumlah angka dengan membaca deret tersebut dari 
    kanan ke kiri.
 * 12.Mencetak angka dari deret angka unik yang letaknya sama dengan letak angka terbesar
    pada deret jumlah angka.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> holderAngka = new ArrayList<Integer>();
        ArrayList<Integer> holderModus = new ArrayList<Integer>();
        int bilangan = s.nextInt();

        while (!(bilangan < 0)) {
            holderAngka.add(bilangan);
            bilangan = s.nextInt();
        }

        Collections.sort(holderAngka, Collections.reverseOrder());
        for (int l = 0; l <= holderAngka.get(0); l++) {
            holderModus.add(0);
        }

        for (int i = 0; i < holderAngka.size(); i++) {

            int ambilAngka = holderAngka.get(i);

            int ambilTotal = holderModus.get(ambilAngka);

            holderModus.set(ambilAngka, (ambilTotal + 1));
        }

        int AngkaModus = 1;
        for (int i = 0; i < holderModus.size(); i++) {
            if (holderModus.get(i) >= holderModus.get(AngkaModus)) {
                AngkaModus = i;
            }
        }
        System.out.println(AngkaModus);
    }
}
