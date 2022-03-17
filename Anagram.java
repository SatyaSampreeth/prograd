import java.util.*;

public class Main
{
    
    public static boolean check(String s1, String s2)
    {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return (Arrays.equals(a1, a2));   
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Strings");
        String[] s1 = sc.nextLine().split("");
        String[] s2 = sc.nextLine().split("");
        // System.out.println("Enter no of Strings");
        // int n = Integer.parseInt(sc.nextLine());
        // int r=0;
        // for (int i=0;i<n;i++){
        //     System.out.println("Enter String");
        //     String s2 = sc.nextLine();
        //     if(check(s1, s2)){
        //     r+=1;
        //     }
        // }
        HashMap<String,Integer> h1 = new HashMap<String,Integer>();
        for(int i=0;i<s1.length;i++){
            if (h1.containsKey(s1[i])){
                h1.put(s1[i],h1.get(s1[i])+1);
            }
            else{
                h1.put(s1[i],1);
            }
        }
        HashMap<String,Integer> h2 = new HashMap<String,Integer>();
                for(int i=0;i<s2.length;i++){
            if (h2.containsKey(s2[i])){
                h2.put(s2[i],h2.get(s2[i])+1);
            }
            else{
                h2.put(s2[i],1);
            }
        }
        System.out.println("Anagrams :"+ h1.equals(h2));
        // System.out.println("No of Anagrams are "+r);
    }
}
