class Holiday{
    private String name;
    private int day;
    private String month;
    
    Holiday(){}
    
    Holiday(String name, int day, String month)
    {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    
    public String getmonth(){
        return this.month;
    }
    public int getday(){
        return this.day;
    }
    
    // public void setname(String name){
    //     this.name=name;
    // }
    // public void setmonth(String month){
    //     this.month = month;
    // }
    // public void setday(int day){
    //     this.day = day;
    // }
    
    public void set(String name, int day, String month){
        this.name=name;
        this.day = day;
        this.month =month;
    }
    
    public void show(){
        System.out.println(name+" is on "+day+" of "+month);
    }
}


public class Main
{
    public static boolean inSameMonth(String m1, String m2){
        if (m1==m2){
            return true;
        }
        return false;
    }
        
    public static void avgDate(Holiday[] arr){
        int length = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getday();
        }
 
        float average = sum / length;
         
        System.out.println("Average of dates : "+average);
    }
    
	public static void main(String[] args) {
		Holiday h1 = new Holiday("New Year",31,"December");
		Holiday h2 = new Holiday("Christmas",25,"December");
		
		if (inSameMonth(h1.getmonth(),h2.getmonth())){
		    System.out.println("Both are in Same Month");
		}
		else{
		System.out.println("Both have different months");
		}
		        Holiday h3 = new Holiday();
        h3.set("Pongal", 15, "January");
        // h3.setname("Pongal");
        // h3.setday(15);
        // h3.setmonth("January");
        h3.show();
		
		Holiday[] arr = {h1,h2,h3};
        avgDate(arr);

	}
}


