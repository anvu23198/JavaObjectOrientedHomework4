public class SeperateDuplicates
{
   public static void main(String[] args)
   {
      
      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));
      
   }
   
   public static String seperateDuplicatesChars(String str)
   {
      //To be completed
      String a = "";
      for(int i = 0; i < str.length() - 1; i++)
      {
         a += str.charAt(i);
         if(str.charAt(i) == str.charAt(i+1))
         {
            a+= "-";
         }
      }
      
      a += str.charAt(str.length()-1);
      
      return a;

   }
}