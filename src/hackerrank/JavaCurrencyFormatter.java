package hackerrank;

import java.util.Scanner;

public class JavaCurrencyFormatter {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String data = scan.nextLine();
		
		scan.close();
		
		String main = "";
		
		String sub = "";
		
		if(data.contains(".")) {
			
			main = data.split("\\.")[0];
			sub = data.split("\\.")[1];
			
		}else {
			
			main = data;
			
		}
		
		String mainFormated = "";
		
		int count = 0;
		
		for(int i = main.length()- 1 ; i >= 0 ;i--) {
			
			if(count%3==0 && count!=0) {
				mainFormated = ","+ mainFormated;
			}
				mainFormated = String.valueOf(main.charAt(i)) + mainFormated;
			
			count++;
			
		}
		
		System.out.println("US:"+"$"+mainFormated+"."+sub.substring(0,2));
		System.out.println("India:"+"Rs."+mainFormated+"."+sub.substring(0,2));
		System.out.println("China:"+"￥"+mainFormated+"."+sub.substring(0,2));
		System.out.println("France:"+(mainFormated.contains(",") ? mainFormated.replaceAll(",", " "):mainFormated )+","+sub.substring(0,2)+" €");
		
		
	}

}


//other way Using Number Formate

/*
 import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /
        Locale indiaLocale = new Locale("en", "IN");

        
        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

       
        System.out.println("US: "     + us.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}
 */