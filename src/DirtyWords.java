//Justin Himmighoefer
//This program designates a list of dirty words that is used to compare to a
//string and returns a censored version to the user.

public class DirtyWords
{
  public static void main(String[] args)
  {
    String[] dirtyWords = {"shutup", "stupid", "bum", "fart", "butthead", "poop", "poo", "hate"};   
    StringBuilder myString 
      = new StringBuilder("This computer is a piece of poop. I hate the stupid butthead interface. The bum who designed the machine should be paid in poo, farted out of the business and told to shutup");
    
    System.out.println("Original");
    System.out.println(myString);
    for(String dirty: dirtyWords)
    {
     System.out.println("Found " + dirty + " at " + myString.indexOf(dirty, 0)); 
     int dirtyIndex = myString.indexOf(dirty, 0);
     if(dirtyIndex > -1)
     	{	 
     		for(int i = 0; i < dirty.length(); ++i)
     		{
     			myString.setCharAt(dirtyIndex + i, '*');
     			System.out.println("i = " + i);
     		}//end for
     	}//end if
    }//end for
    System.out.println("Censored Version");
    System.out.println(myString);
  }//end main
}//end class