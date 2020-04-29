import java.util;
public class P2_7{
	public static void main(String[] args){
		GregorianCalendar cal = new GregorianCalendar(2019, Calendar.OCTOBER, 11);
		cal.add(Calendar.DAY_OF_MONTH, 100);
    int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH); 
    int month = cal.get(Calendar.MONTH); 
    int year = cal.get(Calendar.YEAR); 
    int weekday = cal.get(Calendar.DAY_OF_WEEK); 	
        System.out.println(weekday + “ “ + dayOfMonth + “ “ + month + “ “ + year);

        GregorianCalendar birthday = new GregorianCalendar(2004, Calendar.SEPTEMBER, 4);		
    System.out.println(birthday.get(Calendar.DAY_OF_WEEK));

    birthday.add(Calendar.DAY_OF_MONTH, 10000);
    month = birthday.get(Calendar.MONTH); 
    year = birthday.get(Calendar.YEAR); 
    int dayOfMonth = birthday.get(Calendar.DAY_OF_MONTH); 
    System.out.print(dayOfMonth + “ “ + month + “ “ + year);
  }
}
