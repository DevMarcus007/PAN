package datas;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Timezone {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		TimeZone zona_local = calendar.getTimeZone();
		
		String[] fusinho = TimeZone.getAvailableIDs();
		for (String fuso: fusinho) {
			System.out.println(fuso);
		}
		
		Calendar local = new GregorianCalendar();
		Calendar euroCal = new GregorianCalendar(TimeZone.getTimeZone("Europe/Tiraspol"));
		
		System.out.println(euroCal);
	}
	

}
