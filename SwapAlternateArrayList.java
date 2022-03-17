import java.util.*;
import java.io.*;
public class Main
{
    static void swap(ArrayList int_array){
        int i = 0;
        while (i < int_array.size() - 1) {
            Collections.swap(int_array, i,i+1);
            i = i + 2;
        }
        System.out.print("After swap list are:");
        System.out.println(int_array);
    }
	public static void main(String[] args) {
		System.out.println("Enter number of elemets");
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> int_array = new ArrayList();
		
		for(int i=0;i<size;i++){
		    System.out.println("enter the number");
		    int_array.add(Integer.parseInt(sc.nextLine()));
		}
		System.out.println(int_array);
		swap(int_array);
		
	}
}
