
import java.util.ArrayList;

class Reck
{
    public static void permuteString(String beginningString, String endingString, ArrayList<String> Allwords)
    {
    if (endingString.length() <= 1)
    {
        Allwords.add(beginningString+endingString);
    }
       
    else
      for (int i = 0; i < endingString.length(); i++) 
      {
        try
        {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);
          permuteString(beginningString + endingString.charAt(i), newString, Allwords);
        }
        catch (StringIndexOutOfBoundsException exception) 
        {
          exception.printStackTrace();
        }
      }
  }
   /* public static void main(String[] args)
    {
       ArrayList<String> Allwords = new ArrayList<String>();
      //  System.out.println(Permutations.get(0));
      permuteString("", "Yagyavr", Allwords);
      System.out.println(Allwords.get(3)); 
    }*/

} 
