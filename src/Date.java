import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Date {
	
	public LocalDateTime getDateTime(){
		LocalDateTime cDateTime = LocalDateTime.now();
		//System.out.println("Current Date & Time : "+ cDateTime);
		return cDateTime;
	}
	
	public void getTime(){
		LocalTime currentTime = LocalTime.now();
		System.out.println("Current Time :"+ currentTime);
	}
	
	public void formatedDateTime(){
		
		Date myDT = new Date();
		LocalDateTime dt = myDT.getDateTime();
		System.out.println("Before Formating : "+ dt);
		
		DateTimeFormatter fmDateTimeObj = DateTimeFormatter.ofPattern("dd-mm-YY HH:mm:ss");
		
		String fmDateTime = fmDateTimeObj.format(dt);
		
		System.out.println("After Formating :"+ fmDateTime);
		
	}

	public static void main(String[] args) {
		LocalDate myObj = LocalDate.now();
		System.out.println("Now Date :"+ myObj);
		
		//Current Time
		Date myDT = new Date();
		myDT.getTime();
		
		//Current Date Time
		myDT.getDateTime();
		myDT.formatedDateTime();
		
	}
}
