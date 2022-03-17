import java.io.*;
import java.util.*;

class Student implements Serializable {

	private String name;
	private int age;
	private String gender;

	Student() {
	};

	Student(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String toString() {
		return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
	}
}
public class Main
{
    static void ReadObjectFromFile() {
 
    try {
 
        FileInputStream fi = new FileInputStream("file.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);

		while (fi.available() != 0) {
        Student pr = (Student) oi.readObject();
        if (pr != null)
        System.out.println(pr);
        }
        oi.close();
		fi.close();
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    static void WriteObjectToFile(Student s) {
 
        try {
 
            FileOutputStream f = new FileOutputStream("file.txt");
			ObjectOutputStream o = new ObjectOutputStream(f);
			o.writeObject(s);

			o.close();
			f.close();
            System.out.println("The Object  was succesfully written to a file");
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
 
    
	public static void main(String[] args) {
    
    Student p1 = new Student("Ram", 30, "Male");
	Student p2 = new Student("Sita", 25, "Female");
	
	WriteObjectToFile(p1);
    ReadObjectFromFile();
	WriteObjectToFile(p2);
	ReadObjectFromFile();
    
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter r- read, w- write, q- quit");
    // String s  = sc.nextLine();
    // try{
    // while(s.equals("r") || s.equals("w")){
    //     if (s.equals("r")){
    //         ReadObjectFromFile();
    //     }
    //     else{
    //         System.out.println("Enter name: ");
    //         String name = sc.nextLine();
    //         System.out.println("Enter age: ");
    //         int age = Integer.parseInt(sc.nextLine());
    //         System.out.println("Enter gender: ");
    //         String gender = sc.nextLine();
            
    //         Student st = new Student(name, age, gender);
    //         WriteObjectToFile(st);
    //     }
    //     System.out.println("Enter r- read, w- write, q- quit");
    //     s=sc.nextLine();
    // }
    // }
    // catch (Exception e){
    //     System.out.println(e);
    // }
	}
}
