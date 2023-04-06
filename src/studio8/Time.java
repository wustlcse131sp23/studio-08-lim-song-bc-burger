package studio8;


public class Time {
	
	private int hour;
	private int minute;
	private boolean is24Hour;
	
	public Time (int hour, int minute, boolean is24Hour) {
		this.hour=hour;
		this.minute=minute;
		this.is24Hour=is24Hour;
	}
	
	public String toString() {
		if (is24Hour == true) {
			return hour+12+":"+minute;
		}
		else {
			return hour+":"+minute;
		}
	}

	public static void main(String[] args) {
		Time t1= new Time (6, 23, true);
    	System.out.println(t1);
    	Time t2= new Time (18, 23, false);
    	System.out.println(t1.equals(t2));
    }
	
	public boolean equals (Time t1) {
		int hour2 = 0;
		if (is24Hour == true) {
			hour2 = hour-12;
			if (hour2 == t1.hour) {
				
			}
		}
		if
	}

}