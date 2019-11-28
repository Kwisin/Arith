import java.util.Scanner;
import java.util.concurrent.Executors;

public class PDD2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<n;i++){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            for(int j=0;i<arr1.length;i++){
                Boolean flag = false;
                for(int k=0;k<arr2.length;k++){
                    if(arr1[j]==arr2[k]){
                        flag = true;
                    }
                }
                if(!flag){
                    System.out.println("{");
                    System.out.println("}");
                }
            }
        }
    }
}
