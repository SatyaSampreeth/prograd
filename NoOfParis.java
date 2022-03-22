package assignment;

import java.util.Scanner;

public class NoOfParis {
	static void check(int[] arr,int r) {
		int t=0;
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]*arr[j]==r) {
					t++;
				}
			}
		}
		System.out.println("Posssible pairs are: "+t);
	}
	
	public static void main(String[] args) {
		System.out.print("Enter the size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter " + n + " Numbers: ");
		int [] arr = new int [n];
		int i=0;
		  while(i<n)
		    {
		        arr[i] = sc.nextInt();
		        i++;
		    }
		System.out.print("Enter the Product: ");
		int r = sc.nextInt();
		check(arr,r);
}
}
