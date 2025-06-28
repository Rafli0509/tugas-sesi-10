import java.lang.Exception;

public class CobaException4 {
    public static void main(String[] args) {
        int bil=10;
        String b[]={"a","b","c"};
        try
        {
            System.out.println(bil/0);
            System.out.println(b[3]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Terjadi Aritmatika error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Melebihi jumlah array");
        }
        catch(Exception e)
        {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
// sebelum pembetulan program kamu mencoba mengakses indeks ke-3, padahal array hanya memiliki indeks 0, 1, 2.
// setelah dijalankan maka terjadi muncul tulisan "Melebihi jumlah array"