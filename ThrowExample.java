public class ThrowExample {

    static void demo()
    {
        NullPointerException t;
        t=new NullPointerException("Coba Throw");
        throw t;
        // Baris ini tidak lagi dikerjakan;
        //System.out.println("Ini tidak lagi dicetak"); // <-- INI yang error. Hapus atau pindahkan
    }

    public static void main(String[] args) {
        try
        {
            demo(); // memanggil fungsi yang melempar exception
            System.out.println("Selesai"); // tidak akan dijalankan karena exception dilempar
        }
        catch(NullPointerException e)
        {
            System.out.println("Ada pesan error: "+e);
        }
    }

}
//Blok try-catch berfungsi menangkap exception tersebut agar program tidak crash.
//Baris dalam catch akan dieksekusi jika exception terjadi.