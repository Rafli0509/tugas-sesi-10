import java.lang.Exception;

class Propagate {

    public static void main(String[] args)
    {
        try
        {
            // System.out.println(reverse("This is a string")); sebelum dihapus terjadi "gnirts a si sihT"
            System.out.println(reverse(""));
        } // jika dihapus terjadi "The String was blank All done"
        catch(Exception e)
        {
            System.out.println("The String was blank");
        }
        finally
        {
            System.out.println("All done");
        }
    }


    public static String reverse(String s) throws Exception
    {
        if(s.length()==0)
        {
            throw new Exception();
        }
        String reverseStr = "";
        for(int i=s.length()-1 ; i>=0 ; --i){
            reverseStr+=s.charAt(i);
        }
        return reverseStr;
    }

}