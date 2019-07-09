public class Reverse
{
   public static void main(String[] args)
   {
      
      System.out.println(isExactReverse("ba", "a"));
      System.out.println(isExactReverse("desserts", "stressed"));
      System.out.println(isExactReverse("apple", "apple"));
      System.out.println(isExactReverse("regal", "lager"));
      System.out.println(isExactReverse("war", "raw"));
      System.out.println(isExactReverse("pal", "slap"));
      
   
   }
   public static boolean isExactReverse(String x, String y)
   {
      //To be completed
      if(x.length() != y.length())
         return false;
      
      int count = y.length()-1;
      
      for(int i = 0; i < x.length(); i++)
      {
         if(y.charAt(count) == x.charAt(i))
         {
            count--;
         }
         else
         {
            return false;
         }
      }
      
      return true;
   
   }

}