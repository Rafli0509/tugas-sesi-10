import java.lang.Exception;

public class Exception5 {

    public static void main(String[] args) {
        int bil=10;
        try
        {
            System.out.println(bil/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Pesan error:  ");
            System.out.println(e.getMessage());
            System.out.println("Info stack erase");
            e.printStackTrace();
            e.printStackTrace(System.out);
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }

}
// System.out.println(bil / 0); membagi angka dengan nol menyebabkan ArithmeticException.
// Karena dibungkus di blok try, maka Java langsung melompat ke catch(ArithmeticException e)
// Keduanya mencetak jejak error lengkap (stack trace) ke output standar
// Karena kamu memanggil dua kali, maka stack trace dicetak dua kali.
// ArithmeticException = jenis exception
// by zero = pesan exception
//Exception5.java:9 = baris ke-9 adalah tempat error terjadi (bil / 0)