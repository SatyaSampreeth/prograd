package assignment;

import java.util.Scanner;

public class IPaddress {
	
	public static boolean ValidateIpvaddress(String s) {
		String[] a = s.split("\\.");
		try {
		if ( a.length != 4 ) {
            return false;
        }
		if ( a[3].equals("0") || a[3].equals("255") ) {
            return false;
        }
		for (int i=0;i<4;i++) {
            int n = Integer.parseInt( a[i]);
            if ( (n < 0) || (n > 255) ) 
            	{
                return false;
            	}
		}
		return true;
		}
		catch (Exception e) {
			System.out.println("Enter only Numbers");
		}
		return false;
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the IPv4 Address: ");
		String s = sc.nextLine();
		System.out.println(ValidateIpvaddress(s));
	}
}
