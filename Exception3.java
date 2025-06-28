import java.lang.Exception;

public class Exception3 {

    public static void main(String[] args) {
        int bil=10;
        try {
            System.out.println(bil/0); // program mencoba membagi sebuah bilangan dengan nol
        } //pembagian dengan nol tidak terdefinisi. Dalam Java (dan bahasa pemrograman lainnya)
        catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}