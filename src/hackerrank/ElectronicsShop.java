package hackerrank;

import java.util.Scanner;

public class ElectronicsShop {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        long totalAmount = scan.nextLong();

        int keyboardArrayLength = scan.nextInt();

        long[] keyboard = new long[keyboardArrayLength];

        int usbArrayLength = scan.nextInt();

        long[] usb = new long[usbArrayLength];

        long max = -1;

        for(int i = 0 ; i < keyboardArrayLength ;i++){
            keyboard[i] = scan.nextLong();
        }

        for(int i = 0 ; i < usbArrayLength ; i++){
            usb[i] = scan.nextLong();
        }

        scan.close();

        for(int i = 0 ; i < keyboardArrayLength ;i++){

            for(int j = 0 ; j < usbArrayLength;j++) {

                long compare = keyboard[i] + usb[j];
                if (compare <= totalAmount && compare > max) {
                    max = compare;
                }

            }

        }

        System.out.println(max);


    }

}
