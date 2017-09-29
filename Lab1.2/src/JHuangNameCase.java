/**
	Jaron Huang
	9/28/17
	Lab 1.2 - NameCase
**/
public class JHuangNameCase implements NameCase 
{
    public static void main (String [] args)
    {
    	NameCase test = new JHuangNameCase();
    	System.out.println("This is where you should test your code.");
    	System.out.println(test.titlecase("LeViN"));
    	System.out.println(test.swapcase("lEvIn"));
    	System.out.println(test.alternatingcase("PoPcOrN"));
    	
    }
/*
 	titlecase takes in a string and converts it to titlecase, first letter is uppercase and the rest following is lowercase.
 	
 	Parameter:
 	String name - Takes in a string. 
*/
    public String titlecase(String name)
    {
    	String First = "";
    	String Rest = "";
    	First = (name.substring(0, 1)).toUpperCase();
    	Rest = (name.substring(1, name.length())).toLowerCase();
    	name = First + Rest;
		return name;
    }
    
/*
 	swapcase takes in a string and converts the first letter to a lowercase and the rest following is uppercase.
 	
 	Parameter:
 	String name - Takes in a string. 
*/    
    public String swapcase(String name)
    {
    	String First = "";
    	String Rest = "";
    	First = (name.substring(0, 1)).toLowerCase();
    	Rest = (name.substring(1, name.length())).toUpperCase();
    	name = First + Rest;
    	return name;
    }
    
/*
 	alternatingcase takes in a string and alternates each letter between uppercase and lowercase. The first letter is a lowercase letter.
 	
 	Parameter:
 	String name - Takes in a string. 
*/  
    public String alternatingcase(String name)
    {
    	String result = "";
    	for (int i = 0; i < name.length(); i++)
    	{
    		if (i % 2 == 0)
    		{
    			String low = name.substring(i, i+1);
    			result += low.toLowerCase();
    		}
    		if (i % 2 == 1)
    		{
    			String up = name.substring(i, i+1);
    			result += up.toUpperCase();
    		}
    	}
        return result;
    }

}
