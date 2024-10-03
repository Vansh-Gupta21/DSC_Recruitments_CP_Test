package DSCcp;

import java.util.Scanner;

public class bottle_shipping_problem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bottles = scn.nextShort();

        bottle_packs(bottles);
    }
    static void bottle_packs(int bottles){
        int xlCap = 48;
        int largeCap = 24;
        int mediumCap = 12;
        int smallCap = 6;

        int xlCartons = bottles / xlCap;
        bottles %= xlCap;

        int largeCartons = bottles / largeCap;
        bottles %= largeCap;

        int mediumCartons = bottles / mediumCap;
        bottles %= mediumCap;

        int smallCartons = bottles / smallCap;
        bottles %= smallCap;

        if (xlCartons > 0) {
            System.out.print(xlCartons + " xl, ");
        }
        if (largeCartons > 0) {
            System.out.print(largeCartons + " large, ");
        }
        if (mediumCartons > 0) {
            System.out.print(mediumCartons + " medium, ");
        }
        if (smallCartons > 0) {
            System.out.println(smallCartons + " small");
        }
//        if (bottles > 0) {
//            System.out.print("Remaining bottles: " + bottles);
//        }
    }
}
