import java.util.Scanner;

class Vehicle{
    String name="Vehicle";
    String colour;
    public void name(){
        System.out.println("I am a "+this.name);
    }
    public void name(String colour){
        System.out.println("I am a "+colour+" "+this.name);
    }
}
class Car{
    String name="Car";
    String colour;
    public void name(){
        System.out.println("I am a "+this.name);
    }
      public void name(String colour){
        System.out.println("I am a "+colour+" "+this.name);
    }
}
class Bus{
    String name="Bus";
    String colour;
    public void name(){
        System.out.println("I am a "+this.name);
    }
    public void name(String colour){
        System.out.println("I am a "+colour+" "+this.name);
    }
}


class Main {
    
  public static void name(String name, String colour){
        System.out.println("I am a "+colour+" "+name);
    }
  
  public static void main(String[] args) {

    Vehicle v = new Vehicle();
    Car c = new Car();
    Bus b = new Bus();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the colour");
    String colour = sc.nextLine();

    name(v.name,colour);
    name(c.name,colour);
    name(b.name,colour);
    System.out.println("Overloading:");
    v.name();
    c.name();
    b.name();
    System.out.println("Overriding");
    v.name(colour);
    c.name(colour);
    b.name(colour);
    
    
  }
}

