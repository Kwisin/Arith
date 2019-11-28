package Sword;

import java.util.Scanner;

public class JDwar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int hillNum = in.nextInt();
            String[] hillHeightStr = in.nextLine().trim().split(" ");
            int[] hillHeightInt = new int[hillHeightStr.length];
            for(int i=0;i<hillHeightInt.length;i++){
                hillHeightInt[i] = Integer.parseInt(hillHeightStr[i]);
            }

        }
    }
}
