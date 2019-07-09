public class MiniString
{
   private String str;
   
   public MiniString(String a)
   {
      this.str = a;
   }
   
   public String makeSubstring(int index)
   {
      String sub = "";
      for(int i = index; i < str.length(); i++)
      {
         sub += this.str.charAt(i);
      }
      return sub;
   }
   
   public String makeSubstring(int begin, int end)
   {
      String sub = "";
      for(int i = begin; i < end; i++)
      {
         sub += this.str.charAt(i);
      }
      return sub;
   }
   
   public int findIndexOf(char a)
   {
      for(int i = 0; i < str.length(); i++)
      {
         if(this.str.charAt(i) == a)
         {
            return i;
         }
      }
      
      return -1;
   }
   
   public int findIndexOf(char a, int begin)
   {
      for(int i = begin; i < str.length(); i++)
      {
         if(this.str.charAt(i) == a)
         {
            return i;
         }
      }
      
      return -1;
   }
   
   public int findIndexOf(String a)
   {
      int j = 0;
      int leng = a.length()-1;
      for(int i = 0; i < this.str.length(); i++)
      {
         if(this.str.charAt(i) == a.charAt(j))
         {
            if(j == leng)
            {
               return i-leng;
            }
            j++;
         }
         else
         {
            j = 0;
         }
      }
      
      return -1;
   }
   
   public int findIndexOf(String a, int begin)
   {
      int j = 0;
      int leng = a.length()-1;
      for(int i = begin; i < this.str.length(); i++)
      {
         if(this.str.charAt(i) == a.charAt(j))
         {
            if(j == leng)
            {
               return i-leng;
            }
            j++;
         }
         else
         {
            j = 0;
         }
      }
      
      return -1;
   }
}