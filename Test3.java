import java.io.*;
import java.lang.Exception;

public class Test3 {
    public void methodA(){
        System.out.println("Method A");
    }
    public void methodB() throws IOException
    {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}
// class Utama
// {
//    public static void main(String[] args) throws IOException
//    {
//        Test3 c=new Test3();
//        c.methodA();
//        c.methodB();
//    }
// }
class Utama
{
    public static void main(String[] args)
    {
        Test3 o=new Test3();
        o.methodA();
        try
        {
            o.methodB();
        }
        catch(Exception e)
        {
            System.out.println("Error di Method B");
        }
        finally
        {
            System.out.println("Ini selalu dicetak");
        };
    }
}

// methodB() dideklarasikan dengan throws IOException, artinya:
// Method ini bisa melempar IOException,
// Siapa pun yang memanggilnya wajib menangani dengan try-catch atau melempar kembali (throws).
// Di sini, main() juga menambahkan throws IOException supaya tidak perlu menangani langsung dengan try-catch.
// Namun, dalam kenyataannya methodB() tidak melempar IOException sama sekali.

