import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main
{
    static void check(String[] words){
        int r=0;
        Set<Integer> s = new HashSet<Integer>();
        SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
        for(String w:words){  
        try
	    {
	        sdfrmt.setLenient(false); 
	       Date date = sdfrmt.parse(w);
	        System.out.println(date); 
	       // s.add((w.split("-")[2]));
	         s.add(date.getYear()+1900);
	    }
	    catch (ParseException e)
	    {
	        continue;
	    } 
    }System.out.println(s);
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
        System.out.print("Enter paragraph: ");  
        String str= "21-12-2002 is valid, 2-1-2000.a not valid and 2-2-111 is okay"; 
        String[] words=str.split("[ ,.!]+");
        // for(String w:words){
        // System.out.println(w);}
        check(words);     
	}
}


