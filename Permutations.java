import java.util.*;

public class Main
{
    static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
	public static void main(String[] args) {
	    System.out.println("Enter the string");
	    Scanner sc = new Scanner(System.in);
	    String s = sc.nextLine();
	    // n!/ (k1!*k2!*k3!...)
	    
	    HashMap<Character,Integer> h = new HashMap<Character,Integer>();
	    for (int i=0;i<s.length();i++){
	        if (h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i),1);
            }
	    }
	    int k=1;
	    for (int i: h.values()){
	        k*=fact(i);
	    }
		System.out.println(fact(s.length())/k);
	}
}
