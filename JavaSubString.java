import java.util.Scanner;

public class JavaSubString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String data = scan.nextLine();
		
		int start = scan.nextInt();
		
		int end = scan.nextInt();
		
		System.out.println(data.substring(start, end));
		
	}

}
