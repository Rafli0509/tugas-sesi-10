import java.lang.Exception;

public class ThrowExample2 {

    public static void main(String[] args) {
        try
        {
            throw new Exception("Here's my Exception");
        }
        catch(Exception e)
        {
            System.out.println("Caught Exception");
            System.out.println("e.getMessage():"+e.getMessage());
            System.out.println("e.toString():"+e.toString());
            System.out.println("e.printStackTrace():");
            e.printStackTrace();
        }
    }
}

//try block:
//Digunakan untuk menjalankan kode yang berpotensi menyebabkan exception.
//Dalam hal ini, exception sengaja dibuat dengan throw new Exception(...).
//catch(Exception e) block:
//Menangkap exception yang dilempar di dalam try.
//Menangani exception dengan menampilkan informasi menggunakan:
//e.getMessage() – menampilkan pesan exception.
//e.toString() – menampilkan jenis exception dan pesannya.
//e.printStackTrace() – menampilkan stack trace lengkap dari mana exception berasal.