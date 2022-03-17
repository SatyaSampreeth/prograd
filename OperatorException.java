import java.util.*;

class MyException extends Exception{
    MyException(String s)
    {
        super(s);
    }
}

public class Main
{
    public static void find(int a, char o, int b) throws MyException
    {
        if (o == '%' || o== '/' ||o== '*' || o=='+' || o=='-')
        {
            double  c=0;
            switch(o)
            {
                case '+':
                    c= a + b;
                    break;
                case '-':
                    c= a - b;
                    break;
                case '*':
                    c= a * b;
                    break;
                case '/':
                    c= (double) a / b;
                    break;
                case '%':
                    c= a%b;
                    break;
            }
            System.out.println("Result is: "+c);
        }
        else
        {
            throw new MyException("Not valid to find ");
        }
    }
    
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    while(true)
	    {
	        try
	        {
		        System.out.println("Enter the i/p in [operand operator operand] format, else enter q to quit");
	            String[] s = sc.nextLine().split(" ");
	            if (s.length>3){
	                    throw new Exception("Size should be only 3");
	                }
	            if (s.length>1 && s.length<4)
	            {
	                int a = Integer.parseInt(s[0]);
	                int b = Integer.parseInt(s[2]);
	                char o = s[1].charAt(0);
	                find(a,o,b);
	            }
	            else
	            { 
	                
	                System.out.println("successfully exitted");
	                break;
	            }
	        }
	        catch (NumberFormatException e)
	        {
                System.out.println(e);
            }
            catch (MyException e)
            {
                System.out.println(e.getMessage()+"Since Operators should be only '%', '+', '-', '/', '*'");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
	    }
	}
}


