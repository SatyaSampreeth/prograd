import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Strings");
        String[] s1 = sc.nextLine().split("");
        String[] s2 = sc.nextLine().split("");
        if (s1.length!=s2.length){
            System.out.println("Anagrams :false");
        }
        
        else{
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
    }}
}

