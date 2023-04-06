package studio8;

public class Date {

	
	private int day;
	private int month;
	private int year;
	private boolean holiday;
	
	public Date (int day, int month, int year, boolean holiday) {
		this.day=day;
		this.month=month;
		this.year=year;
		this.holiday=holiday;
	}
	
	
	
	public String toString() {
		return "Date: "+month+"/"+day+"/"+year;
	}




	public static void main(String[] args) {
    	
    	
    	
    	
    }

}
