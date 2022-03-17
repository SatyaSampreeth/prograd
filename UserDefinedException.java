// Java program that demonstrates the use of throw
import java.util.*;
class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}

public class Main
{
    public static void check(int m) throws MyException{
        
            if (m>18 && m<60){
                System.out.println("You can work");
            }
            else{
                throw new MyException("So Not valid to work");
            }
    }

	public static void main(String args[])
	{
	    while(true){
        try {
            System.out.println("enter age");
            Scanner sc = new Scanner(System.in);
            int m = Integer.parseInt(sc.nextLine());
            check(m);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }catch (MyException e){
            System.out.println("Age should be between 18 and 60 "+e.getMessage());
        }
	}}
}
