package assignment;

import java.util.*;

public class balancedString {
	static void check(String s) {
		Stack<Character> stack = new Stack();
		String r = "";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				r += c;
				stack.push(c);
			} 	
			else {
				if (!stack.isEmpty()) {
					char value = stack.pop();
					
					if (c == ']' && value == '[') {
						r += c;
					}
					else if (c == '}' && value == '{') {
						r += c;
					}
					else if (c == ')' && value == '(') {
						r += c;
					}
					else if (c == ']' && value != '[') {
						stack.push(value);
						r += "[]";
					}
					else if (c == '}' && value != '{') {
						stack.push(value);
						r += "{}";
					}
					else if (c == ')' && value != '(') {
						stack.push(value);
						r += "()";
					}
				}
				else {
					if (c== ']') {
						r += "[]";
					}
					else if (c == '}') {
						r += "{}";
					}
					else if (c == ')') {
						r += "()";
					}
				}
			}
			
		}
		
		while(!stack.isEmpty()) {
			char value = stack.pop();	
			
			if (value == '(') {
				r += ")";
			}
			else if (value == '[') {
				r += "]";
			}
			else {
				r += "}";
			}
		}
		
		System.out.println(r);
	}
			

		
	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		check(s);
	}
}
