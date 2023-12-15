import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AgeFinder {
static Calendar today = Calendar.getInstance();

public int getAge(Date dateOfBirth) {
Calendar birthDate = Calendar.getInstance();
int age = 0;
birthDate.setTime(dateOfBirth);
if (birthDate.after(today)) {
throw new IllegalArgumentException("Cant be born in the future");
}
age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
if ((birthDate.get(Calendar.DAY_OF_YEAR) - today.get(Calendar.DAY_OF_YEAR) > 3)
|| (birthDate.get(Calendar.MONTH) > today.get(Calendar.MONTH))) {
age--;
} else if ((birthDate.get(Calendar.MONTH) == today.get(Calendar.MONTH))
&& (birthDate.get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))) {
age--;
}
return age;
}

public Date getDateAfterNDays(int noOfDays) {
today.add(Calendar.DATE, noOfDays);
return today.getTime();
}

public Date getDateAfterXYearYMonthZDays(int year, int month, int day) {
today.add(Calendar.YEAR, year);
today.add(Calendar.MONTH, month);
today.add(Calendar.DATE, day);
return today.getTime();
}

public static void main(String[] args) throws ParseException {
AgeFinder af = new AgeFinder();
SimpleDateFormat dateInput = new SimpleDateFormat("yyyy-MM-dd");
Date dateOfBirth = dateInput.parse("1999-10-11");
System.out.println("Your Age is: " + af.getAge(dateOfBirth) + " years");
int noOfDays = 20;
System.out.println("The date after " + noOfDays + " is: " + af.getDateAfterNDays(noOfDays));
int year = 1;
int month = 2;
int day = 3;
System.out.println("The date after " + year + " year, " + month + " months and " + day + " days is: "
+ af.getDateAfterXYearYMonthZDays(year, month, day));
}
}