public class Exception {

    public static void main(String[] args) {
        int a[] = new int[5]; // Membuat array dengan 5 element: sedangkan indek 0 sampai 4
        try {

            a[5] = 100; // error terjadi disni padahal indeks ke-5 itu tidak ada (karena indeks terakhir adalah 4).
            }

        catch(java.lang.Exception e) { // setelah diperbaiki dan dijalankan hasilnya ada tulisan Terjadi pelanggaran memory
            System.out.println("Terjadi pelanggaran memory");
        }

    }
}

