package hackerrank;

import java.io.*;
import java.util.*;

class Solution {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		String dayName = "";
		
		switch (dayOfWeek) {
		case 1:
			dayName = "SUNDAY";
			break;
		case 2:
			dayName = "MONDAY";
			break;
		case 3:
			dayName = "TUESDAY";
			break;
		case 4:
			dayName = "WEDNESDAY";
			break;
		case 5:
			dayName = "THURSDAY";
			break;
		case 6:
			dayName = "FRIDAY";
			break;
		case 7:
			dayName = "SATURDAY";
			break;
		default:
			dayName = "SOMETHING WENT WRONG";
			break;
		}
		
		return dayName; 

	}

}

public class JavaDateAndTime {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int month = Integer.parseInt(firstMultipleInput[0]);

		int day = Integer.parseInt(firstMultipleInput[1]);

		int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Solution.findDay(month, day, year);

		bufferedWriter.write(res);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
