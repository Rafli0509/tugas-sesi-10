public class Exception2 {

    public static void main(String[] args) {
        int i=0;
        String greeting[]={ // artinya program mencoba mengakses indeks array yang berada di luar batas yang diperbolehkan.
                "Hello World!", // greeting 0
                "No, I mean it!", // greeting 1
                "Hello World" // greeting 2, indeks maksimum yang valid adalah 2.
        };
        while(i<4) // Karena greeting[3] tidak ada, Java melempar error "ArrayIndexOutOfBoundsException"
        {
            try {
                System.out.println(greeting[i]);
                i++;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i=0;
            }
        }
    }
}
