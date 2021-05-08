package hackerrank;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Zolution
 */
public class Zolution {

  public static void main(String[] args) {

	  Calendar c = Calendar.getInstance();
	  c.set(2021, 4, 9);
	  int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	  System.out.println(dayOfWeek);
  }
}
